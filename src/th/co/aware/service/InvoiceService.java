package th.co.aware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.aware.bean.InvoiceBean;
import th.co.aware.dao.IinvoiceDAO;

@Component
public class InvoiceService implements IinvoiceService{
	
	@Autowired
	private IinvoiceDAO invoiceDAO;
	
	
	public IinvoiceDAO getInvoiceDAO() {
		return invoiceDAO;
	}

	public void setInvoiceDAO(IinvoiceDAO invoiceDAO) {
		this.invoiceDAO = invoiceDAO;
	}



	@Override
	public List<InvoiceBean> listInvoiceByProductcode() {
		
		return null;
	}

}
