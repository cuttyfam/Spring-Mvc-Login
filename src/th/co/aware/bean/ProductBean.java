package th.co.aware.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;

public class ProductBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4277789481957500517L;

	private String product_code;

	private String isactive;

	private String name;

	private float price;

	private int store_id;

	private Timestamp updated;
	
	private Timestamp created;
	
	private StoreBean storeBean;
	

	public ProductBean() {
		
	}
	
	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public String getProductCode() {
		return product_code;
	}

	public void setProductCode(String productCode) {
		this.product_code = productCode;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStoreId() {
		return store_id;
	}

	public void setStoreId(int storeId) {
		this.store_id = storeId;
	}

	public Timestamp getUpdated() {
		Long timeNow = Calendar.getInstance().getTimeInMillis();
		Timestamp ts = new Timestamp(timeNow);
		return ts;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public Timestamp getCreated() {
		Long timeNow = Calendar.getInstance().getTimeInMillis();
		Timestamp ts = new Timestamp(timeNow);
		return ts;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public StoreBean getStoreBean() {
		return storeBean;
	}

	public void setStoreBean(StoreBean storeBean) {
		this.storeBean = storeBean;
	}
	
	
	
}
