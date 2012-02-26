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
}