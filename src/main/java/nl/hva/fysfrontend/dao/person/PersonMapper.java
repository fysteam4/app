package nl.hva.fysfrontend.dao.person;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import nl.hva.fysfrontend.model.Person;

public class PersonMapper implements ResultSetMapper<Person> {

	@Override
	public Person map(int index, ResultSet result, StatementContext ctx) throws SQLException {
		return new Person(result.getInt("id"), result.getString("first_name"), result.getString("last_name"),
				result.getString("password"), result.getString("dob"), result.getDate("last_login"),
				result.getBoolean("isEnabled"), result.getString("personCode"), result.getString("email"));
	}

}
