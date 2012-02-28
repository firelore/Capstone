package controllers;

import play.*;
import play.mvc.*;

@CRUD.For(models.concerts.Event.class)
@With(Secure.class)
public class AdminEvents extends CRUD {

}