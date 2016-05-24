package nl.hva.fysfrontend.service;

import nl.hva.fysfrontend.model.Person;

public interface LoginService {
	
	public Person login(Person person);
	
	public void register(Person person);
	
	public void resetPassWord(String email);

}