package th.co.aware.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;



public class InvoiceBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2737206083018069244L;

	
	private int invoice_id;

	private Timestamp invoice_date;

	private String product_code;
	
	private String vat;
	
	private ProductBean productBean;
	
	

	public InvoiceBean() {
	}

	
	public int getInvoice_id() {
		return invoice_id;
	}


	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	
	
	public Timestamp getInvoice_date() {
		Long timeNow = Calendar.getInstance().getTimeInMillis();
		Timestamp ts = new Timestamp(timeNow);
		return ts;
	}


	public void setInvoice_date(Timestamp invoice_date) {
		this.invoice_date = invoice_date;
	}


	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public ProductBean getProductBean() {
		return productBean;
	}
	
	
	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	
}
