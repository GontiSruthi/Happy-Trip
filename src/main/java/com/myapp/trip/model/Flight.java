package com.myapp.trip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.annotation.Id;

@Entity
@Table(name = "FlightDetails")
public class Flight {
	@Id
	@Column(name = "flight_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flight_no;
	@Column
	private String flight_name;
	@Column
	private String airline_code;
	@Column
	private String airline_name;
	@Column
	private int capacity;
	@Column
	private String from_City;
	@Column
	private String to_City;
	@Column
	private String arrival_Time;
	@Column
	private String depature_Time;
	@Column
	private double ticket_Cost;

	public Flight(int flight_no, String flight_name, String airline_code, String airline_name, int capacity,
			String from_City, String to_City, String arrival_Time, String depature_Time, float ticket_Cost) {
		super();
		this.flight_no = flight_no;
		this.flight_name = flight_name;
		this.airline_code = airline_code;
		this.airline_name = airline_name;
		this.capacity = capacity;
		this.from_City = from_City;
		this.to_City = to_City;
		this.arrival_Time = arrival_Time;
		this.depature_Time = depature_Time;
		this.ticket_Cost = ticket_Cost;
	}

	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getAirline_code() {
		return airline_code;
	}

	public void setAirline_code(String airline_code) {
		this.airline_code = airline_code;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFrom_City() {
		return from_City;
	}

	public void setFrom_City(String from_City) {
		this.from_City = from_City;
	}

	public String getTo_City() {
		return to_City;
	}

	public void setTo_City(String to_City) {
		this.to_City = to_City;
	}

	public String getArrival_Time() {
		return arrival_Time;
	}

	public void setArrival_Time(String arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

	public String getDepature_Time() {
		return depature_Time;
	}

	public void setDepature_Time(String depature_Time) {
		this.depature_Time = depature_Time;
	}

	public double getTicket_Cost() {
		return ticket_Cost;
	}

	public void setTicket_Cost(double ticket_Cost) {
		this.ticket_Cost = ticket_Cost;
	}

}