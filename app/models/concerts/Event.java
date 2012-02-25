package models.concerts;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class Event extends Model {
	@ManyToMany
	public List<Band> bands;

	@ManyToMany(mappedBy="events", cascade=CascadeType.PERSIST)
	public List<Venue> venues;

	public String eventName;
	public Date eventDate;
	public String genre;

	public Event() {}
	public Event(String eventName, Date eventDate) {
		this.eventName = eventName;
		this.eventDate = eventDate;
	}
}