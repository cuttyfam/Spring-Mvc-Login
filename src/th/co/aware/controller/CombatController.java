package th.co.aware.controller;

import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import th.co.aware.bean.InvoiceBean;
import th.co.aware.bean.ProductBean;
import th.co.aware.bean.UserBean;
import th.co.aware.service.ICombatService;
import th.co.aware.service.IProductService;
import th.co.aware.service.IinvoiceService;

@Controller
public class CombatController {
	@Autowired
	private IinvoiceService invoiceService;
	
	
	public IinvoiceService getInvoiceService() {
		return invoiceService;
	}

	public void setInvoiceService(IinvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}

	@Autowired
	private IProductService productService;
	
	public IProductService getProductService() {
		return productService;
	}

	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	@Autowired
	private ICombatService combatService;
	

	public void setCombatService(ICombatService combatService) {
		this.combatService = combatService;
	}

	public ICombatService getCombatService() {
		return combatService;
	}

	@RequestMapping("toLogin")
	public String toLogin(Model model) {
		model.addAttribute("userBean", new UserBean());
		return "login";
	}

	@RequestMapping(value = "doLogin", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute @Valid UserBean userBean, BindingResult result) {
		ModelAndView view = new ModelAndView("login");
		if (!result.hasFieldErrors()) {
			
			if(!combatService.authenticateUser(userBean)){
				result.addError(new ObjectError("err", "Username or Password is incorrect"));
			} else {
				view.setViewName("Welcome");
			}
		}
		return view;
	}
	
	@RequestMapping("toAdd")
	public String toAdd(Model model){
		model.addAttribute("productBean", new ProductBean());
		return "AddProduct";
	}
	
	@RequestMapping(value = "doAdd")
	public ModelAndView doAdd(@ModelAttribute @Valid ProductBean productBean, BindingResult result){
		ModelAndView view = new ModelAndView("AddProduct");
		productService.addProduct(productBean);
		
		view.setViewName("Welcome");
		return view;
	}
	
	@RequestMapping("toDel")
	public String toDel(Model model){
		model.addAttribute("productBean", new ProductBean());
		return "deleteProduct";
	}
	
	@RequestMapping(value = "doDel")
	public ModelAndView doDel(@ModelAttribute @Valid ProductBean productBean, BindingResult result){
		ModelAndView view = new ModelAndView("deleteProduct");

		productService.delete(productBean);
		view.setViewName("Welcome");
		return view;
	}
	
	@RequestMapping("toVat")
	public String toVat(Model model){
		model.addAttribute("invoiceBean", new InvoiceBean());
		return "viewVat";
	}
	
	@RequestMapping(value ="doVat")
	public ModelAndView doVat(@ModelAttribute @Valid InvoiceBean invoiceBean, BindingResult result){
		ModelAndView view = new ModelAndView("viewVat");
		float caluculateVat = 0;
		//String storeName = "";

		List<InvoiceBean> invoices = new ArrayList<InvoiceBean>(invoiceService.listInvoiceByProductcode());

		for (InvoiceBean invoice : invoices) {
			//storeName = invoice.getProductBean().getStoreBean().getName();

			String vat = invoice.getVat();
			if (vat.equals("7")) {
				caluculateVat += invoice.getProductBean().getPrice() + (invoice.getProductBean().getPrice() * 0.07);
			} else {
				caluculateVat += invoice.getProductBean().getPrice();
			}

		}
		//view.addObject("storeName", storeName);
		view.addObject("vat", caluculateVat);
		view.addObject("invoiceList", invoiceService.listInvoiceByProductcode());

		return view;
	}
}
