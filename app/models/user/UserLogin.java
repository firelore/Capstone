package models.user;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class UserLogin extends Model {
	@Email
	@Required
	public String email;

	@Required
	public String password;

	public UserProfile accountInformation;

	public UserLogin(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public static UserLogin connect(String email, String password) {
		return find("byEmailAndPassword", email, password).first();
	}

	public static boolean exists(String email) {
		UserLogin user = null;
		user = find("byEmail", email).first();

		if (user != null) {
			// User exists
			return true;
		}
		// User does not exist
		return false;
	}

	public String toString() {
		return email;
	}
}