package controllers;

import play.*;
import play.mvc.*;

@CRUD.For(models.user.UserProfile.class)
@With(Secure.class)
public class AdminUserProfiles extends CRUD {

}