package nl.hva.fysfrontend.service;

import nl.hva.fysfrontend.dao.UserDao;
import nl.hva.fysfrontend.model.User;

public class LoginServiceImpl implements LoginService {
	
	private UserDao userDao = new UserDao();

	public User login(User user) {
		User resultUser = userDao.find(user);
		if(resultUser != null){
			resultUser.setLoggedIn(true);
		}
		return resultUser;
	}

}
