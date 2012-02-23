package models.user;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class User extends Model {
	@Email
	@Required
	public String email;

	@Required
	public String password;

	public UserDetails accountInformation;

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
}