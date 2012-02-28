package controllers;

import play.*;
import play.mvc.*;

@CRUD.For(models.concerts.Band.class)
@With(Secure.class)
public class AdminBands extends CRUD {

}