package th.co.aware.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import th.co.aware.bean.UserBean;

@Component
public class CombatDAO implements ICombatDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override
	public boolean authenticateUser(UserBean userBean) {
		boolean userExists = false;
		
		int rowcount = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM users" + " WHERE username = ?"
						+ " AND password = ?", userBean.getUsername(), userBean.getPassword());
		if(rowcount==1){
			userExists = true;
		}
		return userExists;
	}
	
}
