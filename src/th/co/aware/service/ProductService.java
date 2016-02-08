package th.co.aware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.aware.bean.ProductBean;
import th.co.aware.dao.IProductDAO;

@Component
public class ProductService implements IProductService{
	@Autowired
	private IProductDAO productDAO;
	
	
	public IProductDAO getProductDAO() {
		return productDAO;
	}



	public void setProductDAO(IProductDAO productDAO) {
		this.productDAO = productDAO;
	}



	@Override
	public int addProduct(ProductBean productBean) {
		
		return productDAO.addProduct(productBean);
	}



	@Override
	public int delete(ProductBean productBean) {
		
		return productDAO.delete(productBean);
	}

}
