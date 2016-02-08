package th.co.aware.bean;

import java.io.Serializable;


import org.hibernate.validator.constraints.NotEmpty;
 
public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9032428181710709260L;
	private String userId;
	private String firstname;
	private String lastname;

	@NotEmpty(message = "Username can't be empty")
	private String username;

	@NotEmpty(message = "Password can't be empty")
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
