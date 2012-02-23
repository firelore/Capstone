package models.concerts;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class Venue extends Model {
	@ManyToMany(cascade=CascadeType.PERSIST)
	public List<Event> events;

	public String hallName;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zipCode;
	public String phoneNumber;

	public Venue() {}
	public Venue(String hallName, String address1,
				String address2, String city, String state,
				String zipCode, String phoneNumber) 
	{
		this.hallName = hallName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}
}