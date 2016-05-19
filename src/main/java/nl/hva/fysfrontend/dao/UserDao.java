package nl.hva.fysfrontend.dao;

import java.util.HashMap;

import nl.hva.fysfrontend.model.User;

public class UserDao {
	
	public HashMap<Integer, User> users;
	
	public UserDao(){
		users = new HashMap<Integer, User>();
		
		User user = new User();
		user.setUserName("fys");
		user.setPassWord("fys1234");
		
		users.put(user.getId(), user);
	}
	
	public User find(User user){
		return findByUserName(user.getUserName());
	}
	
	public User findByUserName(String userName){
		for(User user: users.values()){
			if(user.getUserName().equals(userName)){
				return user;
			}
		}
		return null;
	}
	
	public User findById(int id){
		return null;
	}
}
