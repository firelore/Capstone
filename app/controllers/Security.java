package controllers;

import models.*;
import models.user.*;

public class Security extends Secure.Security {
	static boolean authenticate(String username, String password) {
		return UserLogin.connect(username, password) != null;
	}

	static void onDisconnected() {
		Application.index();
	}
}

