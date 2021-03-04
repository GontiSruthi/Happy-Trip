package com.myapp.trip.database;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<List<String>> queriedData = new ArrayList<>();

	public Database() {
		// TODO Auto-generated constructor stub
	}

	public List<List<String>> queryFlightdatabase() {
		return queriedData;
	}

	/*
	 * public final double averageDistance(List<Flight> flightsList) { return
	 * flightsList.stream().mapToDouble(Flight::getDistance).average().getAsDouble()
	 * ; }
	 * 
	 * public final double minimumDistance(List<Flight> flightsList) { return
	 * flightsList.stream().mapToInt(Flight::getDistance).min().getAsInt(); }
	 * 
	 * public final double maximumDistance(List<Flight> flightsList) { return
	 * flightsList.stream().mapToInt(Flight::getDistance).max().getAsInt(); }
	 */
}
