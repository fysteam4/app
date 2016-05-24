package nl.hva.fysfrontend.model;

import java.sql.Date;

public class Passenger extends Person {

	private String passengerCode;

	public Passenger(int id, String firstName, String lastName, String passWord, String dob, Date lastLogin, boolean isEnabled,
			String personCode, String email, String passengerCode) {
		super(id, firstName, lastName, passWord, dob, lastLogin, isEnabled, personCode, email);
		this.passengerCode = passengerCode;
	}

	public Passenger() {

	}

	public String getPassengerCode() {
		return passengerCode;
	}

	public void setPassengerCode(String passengerCode) {
		this.passengerCode = passengerCode;
	}

}
