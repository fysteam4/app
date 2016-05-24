package nl.hva.fysfrontend.service;

import nl.hva.fysfrontend.dao.person.PersonDao;
import nl.hva.fysfrontend.model.Person;
import nl.hva.fysfrontend.util.RandomPassWordGenerator;

public class LoginServiceImpl implements LoginService {
	
	private PersonDao personDao;
	
	public LoginServiceImpl(PersonDao personDao){
		this.personDao = personDao;
	}

	public Person login(Person person) {
		Person personResult = personDao.findByEmail(person.getEmail());
		
		if(person.getPassWord().equals(personResult.getPassWord())){
			return personResult;
		}
		
		return null;
	}

	@Override
	public void register(Person person) {
		personDao.create(person);
	}

	@Override
	public void resetPassWord(String email) {
		Person person = personDao.findByEmail(email);
		String passWord = RandomPassWordGenerator.getInstance().nextString();
		person.setPassWord(passWord);
		
		personDao.update(person);
	}

}
