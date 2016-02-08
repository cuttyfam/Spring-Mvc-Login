package th.co.aware.dao;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import th.co.aware.bean.InvoiceBean;
import th.co.aware.bean.ProductBean;

@Component
public class InvoiceDAO implements IinvoiceDAO {

	private static JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<InvoiceBean> listInvoiceByProductcode(){
		List<InvoiceBean> invoiceList = new ArrayList<InvoiceBean>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select products.product_code,"
				+ " products.price,products.name,invoices.vat"
				+ " from invoices join producs on invoices.product_code = products.product_code"
				+ " join stores on products.products.store_id = stores.store_id "
				+ " where stores.store_id = 1 " );
		for(Map<String, Object > row : rows){
			InvoiceBean invoice = new InvoiceBean();
			invoice.setProduct_code((String) row.get("product_code"));
			invoice.setVat((String) row.get("vat"));
			
			ProductBean productBean = new ProductBean();
			productBean.setPrice((Float) row.get("price"));
			productBean.setName((String) row.get("name"));
			invoice.setProductBean(productBean);
			invoiceList.add(invoice);
		}
		return invoiceList;
	}

	

}
