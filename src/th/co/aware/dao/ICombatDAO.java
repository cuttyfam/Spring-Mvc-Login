package th.co.aware.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import th.co.aware.bean.UserBean;

public interface ICombatDAO {
	
	@Autowired
	public abstract void setDataSource(DataSource dataSource);
	
	public abstract boolean authenticateUser(UserBean userBean);
}
