package th.co.aware.dao;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import th.co.aware.bean.ProductBean;

public interface IProductDAO {
	
	
	@Autowired
	public abstract void setDataSource(DataSource dataSource);

	public int addProduct(ProductBean productBean);
	
	public int delete(ProductBean productBean);

}
