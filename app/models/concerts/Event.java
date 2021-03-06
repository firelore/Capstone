package models.concerts;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;
import play.modules.search.*;

@Indexed
@Entity
public class Event extends Model {
	@ManyToMany
	public List<Band> bands;

	@ManyToMany(mappedBy="events", cascade=CascadeType.PERSIST)
	public List<Venue> venues;

	@OneToMany(mappedBy="event")
	public List<Ticket> tickets;

	@Field
	@Required
	public String eventName;
	
	@Field
	@InFuture
	public Date eventDate;

	@Field
	public String genre;

	public Event() {}
	public Event(String eventName, Date eventDate) {
		this.eventName = eventName;
		this.eventDate = eventDate;
	}

	public String toString() {
		return eventName;
	}
}