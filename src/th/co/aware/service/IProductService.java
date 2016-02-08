package th.co.aware.service;



import th.co.aware.bean.ProductBean;


public interface IProductService {
	
	public abstract int addProduct(ProductBean productBean);
	
	public abstract int delete(ProductBean productBean);
}
