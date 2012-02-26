package controllers;

import play.*;
import play.mvc.*;
import play.libs.*;
import play.cache.*;
import play.Play;
import play.data.validation.*;

import java.util.*;

import models.concerts.*;

public class Events extends Controller {
	public static void index() {
		Event firstEvent = Event.find("order by eventDate asc").first();
    	List<Event> allEvents = Event.find(
    		"order by eventDate asc").from(1).fetch(10);
        render(firstEvent, allEvents);
	}

	public static void event(String eventName) {
		Event event = Event.find("byEventName", eventName).<Event>first();
		render(event);
	}
}