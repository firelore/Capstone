package models.concerts;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class Event extends Model {
	@OneToMany(mappedBy="concertEvent")
	public List<Band> bands;

	public String eventName;
	public String eventDate;
	public String startTime;

	public Event() {}
	public Event(String eventName, String eventDate, String startTime) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.startTime = startTime;
	}
}