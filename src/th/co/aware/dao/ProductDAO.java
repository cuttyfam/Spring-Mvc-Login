package th.co.aware.dao;


import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import th.co.aware.bean.ProductBean;


@Component
public class ProductDAO implements IProductDAO {
	
	private static JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	@Override
	public int addProduct(ProductBean productBean) {
		int row =  jdbcTemplate.update  
				(" INSERT INTO products(product_code, isactive, name, price, store_id, created) values(" + " ?,  ?,  ?,  ?,  ?,  ? " 
				+ ")" , productBean.getProductCode(), productBean.getIsactive()
				,productBean.getName() ,productBean.getPrice()
				,productBean.getStoreId(),productBean.getCreated() );
		return row;
	}

	@Override
	public int delete(ProductBean productBean) {
		int row = jdbcTemplate.update("DELETE  FROM products WHERE product_code =  ?",productBean.getProduct_code());
		return row;
	}

	
	public static List<ProductBean> select() {
		return jdbcTemplate.query("SELECT * FROM products",new ResultSetExtractor<List<ProductBean>>(){

			@Override
			public List<ProductBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<ProductBean> lists = new ArrayList<ProductBean>();
				while(rs.next()){
					ProductBean pb = new ProductBean();
					pb.setProduct_code(rs.getString(1));
					pb.setName(rs.getString(2));
					pb.setPrice(rs.getFloat(3));
					pb.setStore_id(rs.getInt(4));
					pb.setIsactive(rs.getString(5));
					pb.setCreated(rs.getTimestamp(6));
					pb.setUpdated(rs.getTimestamp(7));
					lists.add(pb);
				}
				return lists;
			}
			
		});
		
	}
	
	
	

}
