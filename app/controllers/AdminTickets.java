package controllers;

import play.*;
import play.mvc.*;

import play.*;
import play.mvc.*;

@CRUD.For(models.concerts.Ticket.class)
@With(Secure.class)
public class AdminTickets extends CRUD {

}