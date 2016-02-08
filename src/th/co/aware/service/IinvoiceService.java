package th.co.aware.service;

import java.util.List;

import th.co.aware.bean.InvoiceBean;

public interface IinvoiceService {
	
	public abstract List<InvoiceBean> listInvoiceByProductcode();
	
}
