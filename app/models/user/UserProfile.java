package models.user;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class UserProfile extends Model {
	public String address;
	public String city;
	public String state;
	public String zipCode;

	public UserProfile() {}
	
	public UserProfile(String address, String city, String state, String zipCode) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
}