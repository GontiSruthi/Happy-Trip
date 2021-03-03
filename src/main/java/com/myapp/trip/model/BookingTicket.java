package com.myapp.trip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "BookingTicket")
public class BookingTicket {

	@Column
	private String from_city;
	@Column
	private String to_city;
	@Column
	private String travel_date;
	@Column
	private int seats;
	@Column
	private String classes;
	@Column
	private int passenger_no;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Booking_reference_no;

	public BookingTicket(String from_city, String to_city, String travel_date, int seats, String classes,
			int passenger_no, int booking_reference_no) {
		this.from_city = from_city;
		this.to_city = to_city;
		this.travel_date = travel_date;
		this.seats = seats;
		this.classes = classes;
		this.passenger_no = passenger_no;
		Booking_reference_no = booking_reference_no;
	}

	public String getFrom_city() {
		return from_city;
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public String getTo_city() {
		return to_city;
	}

	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}

	public String getTravel_date() {
		return travel_date;
	}

	public void setTravel_date(String travel_date) {
		this.travel_date = travel_date;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public int getPassenger_no() {
		return passenger_no;
	}

	public void setPassenger_no(int passenger_no) {
		this.passenger_no = passenger_no;
	}

	public int getBooking_reference_no() {
		return Booking_reference_no;
	}

	public void setBooking_reference_no(int booking_reference_no) {
		Booking_reference_no = booking_reference_no;
	}

}
