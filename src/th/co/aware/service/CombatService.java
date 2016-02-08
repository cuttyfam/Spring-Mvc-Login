package th.co.aware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.aware.bean.UserBean;
import th.co.aware.dao.ICombatDAO;

@Component
public class CombatService implements ICombatService {
	@Autowired
	private ICombatDAO combatDAO;

	public ICombatDAO getCombatBAO() {
		return combatDAO;
	}

	public void setCombatBAO(ICombatDAO combatBAO) {
		this.combatDAO = combatBAO;
	}

	@Override
	public boolean authenticateUser(UserBean userBean) {

		return combatDAO.authenticateUser(userBean);
	}

}
