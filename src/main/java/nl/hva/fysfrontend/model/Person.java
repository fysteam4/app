package nl.hva.fysfrontend.model;

import java.sql.Date;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String passWord;
	private String dob;
	private Date lastLogin;
	private boolean isEnabled;
	private String personCode;
	private String email;

	public Person() {

	}

	public Person(int id, String firstName, String lastName, String passWord, String dob, Date lastLogin, boolean isEnabled,
			String personCode, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.dob = dob;
		this.lastLogin = lastLogin;
		this.isEnabled = isEnabled;
		this.personCode = personCode;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
