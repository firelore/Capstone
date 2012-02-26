package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.concerts.*;

import play.modules.search.*;

public class Searcher extends Controller {
	public static void searchBand(String query) {
		Query q = Search.search(query, Band.class);
		q.orderBy("bandName");
		List<Band> bands = q.fetch();
		render(bands);
	}
}