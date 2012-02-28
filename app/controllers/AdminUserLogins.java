package controllers;

import play.*;
import play.mvc.*;

@CRUD.For(models.user.UserLogin.class)
@With(Secure.class)
public class AdminUserLogins extends CRUD {

}