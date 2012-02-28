package models.concerts;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;
import play.modules.search.*;

@Indexed
@Entity
public class Venue extends Model {
	@ManyToMany()
	public List<Event> events;

	@Field
	@Required
	public String hallName;
	public String address1;
	public String city;
	public String state;
	public String zipCode;
	public String phoneNumber;

	public Venue() {}
	public Venue(String hallName, String address1,
				String city, String state,
				String zipCode, String phoneNumber) 
	{
		this.hallName = hallName;
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return hallName;
	}
}