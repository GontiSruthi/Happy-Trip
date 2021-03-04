package com.myapp.trip.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.myapp.trip.database.Database;
import com.myapp.trip.database.DatabaseUtil;
import com.myapp.trip.model.Flight;

public class FlightTest {

	@Spy
	private Database database;

	private List<List<String>> queriedData;
	private List<Flight> flightsList;

	public FlightTest() {
	}

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		queriedData = new ArrayList<>();
		List<String> row1 = List.of("1", "e", "User1", "false", "500");
		List<String> row2 = List.of("2", "b", "User2", "true", "300");
		List<String> row3 = List.of("3", "e", "User3", "false", "400");
		List<String> row4 = List.of("4", "b", "User4", "true", "800");
		queriedData.add(row1);
		queriedData.add(row2);
		queriedData.add(row3);
		queriedData.add(row4);
	}

	@Test
	public void testQueriedData() {

		when(database.queryFlightdatabase()).thenReturn(queriedData);
		flightsList = DatabaseUtil.buildFlightsList(queriedData);
		assertEquals(4, database.queryFlightdatabase().size());

	}
}
