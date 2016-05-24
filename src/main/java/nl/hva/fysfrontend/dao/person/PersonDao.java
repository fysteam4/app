package nl.hva.fysfrontend.dao.person;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import nl.hva.fysfrontend.model.Person;

@RegisterMapper(PersonMapper.class)
public interface PersonDao {

	@SqlQuery("select * from fys_person where email = :email")
	public Person findByEmail(@Bind("email") String email);

	@SqlQuery("insert into fys_person (personcode, first_name, last_name, dob, password,"
			+ " email, isenabled, last_login) values (:personCode, :firstName, :lastName, :dob, :passWord, :email, :isEnabled, :lastLogin)")
	public void create(@BindBean Person person);
	
	@SqlQuery("select * from fys_person where id = :id")
	public Person find(int id);
	
	@SqlQuery("select * from fys_person")
	public List<Person> findAll();
	
	@SqlUpdate("insert into fys_person (personcode, first_name, last_name, dob, password,"
			+ " email, isenabled, last_login) values (:personCode, :firstName, :lastName, :dob, :passWord, :email, :isEnabled, :lastLogin)")
	public void update(@BindBean Person person);
	
	@SqlUpdate("delete from fys_person where id = :id")
	public void delete(@BindBean Person person);

}
