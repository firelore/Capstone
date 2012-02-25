package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.concerts.*;

public class Application extends Controller {

    public static void index() {
    	Event firstEvent = Event.find("order by eventDate asc").first();
    	List<Event> allEvents = Event.find(
    		"order by eventDate asc").from(1).fetch(10);
        render(firstEvent, allEvents);
    }

}