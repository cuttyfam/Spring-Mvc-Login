package th.co.aware.bean;

import java.io.Serializable;


public class StoreBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1769240985897970105L;
	
	private int store_id;

	private String description;

	private String name;

	public StoreBean() {

	}

	
	public int getStore_id() {
		return store_id;
	}


	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
