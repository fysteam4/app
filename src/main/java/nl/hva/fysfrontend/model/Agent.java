package nl.hva.fysfrontend.model;

import java.sql.Date;

public class Agent extends Person {
	private String agentCode;

	public Agent(int id, String firstName, String lastName, String passWord, String dob, Date lastLogin, boolean isEnabled,
			String personCode, String email, String agentCode) {
		super(id, firstName, lastName, passWord, dob, lastLogin, isEnabled, personCode, email);
		this.agentCode = agentCode;
	}

	public Agent() {

	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

}
