package controllers;

import play.*;
import play.mvc.*;

@CRUD.For(models.concerts.Venue.class)
@With(Secure.class)
public class AdminVenues extends CRUD {

}