package th.co.aware.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import th.co.aware.bean.InvoiceBean;

public interface IinvoiceDAO {
	
	@Autowired
	public abstract void setDataSource(DataSource dataSource);
	
	public List<InvoiceBean> listInvoiceByProductcode();
}
