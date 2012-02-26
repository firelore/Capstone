package models.concerts;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class Ticket extends Model {
	public Double price;
	public int quantity;
	
	@ManyToOne
	public Event event;
}