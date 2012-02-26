package controllers;

import play.*;
import play.mvc.*;
import play.libs.*;
import play.cache.*;
import play.Play;
import play.data.validation.*;

import java.util.*;

import models.concerts.*;

public class Bands extends Controller {
	public static void artist(String name) {
		Band artist = Band.find("byBandName", name).<Band>first();
		render(artist);
	}
}