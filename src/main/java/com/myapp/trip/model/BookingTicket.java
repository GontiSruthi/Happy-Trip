package com.myapp.trip.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "BookingTicket")
public class BookingTicket {

	@Column
	private String fromcity;
	@Column
	private String tocity;
	@Column
	private Date date_of_travel;
	@Column
	private int no_of_seats;

	enum Classes {
		Business, Economy;
	}

	@Enumerated(EnumType.STRING)
	@Column
	private Classes classes;
	@Column
	private int no_of_passesnger;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Bookingreference_no;

	public BookingTicket(String fromcity, String tocity, Date date_of_travel, int no_of_seats, Classes classes,
			int no_of_passesnger, int bookingreference_no) {
		this.fromcity = fromcity;
		this.tocity = tocity;
		this.date_of_travel = date_of_travel;
		this.no_of_seats = no_of_seats;
		this.classes = classes;
		this.no_of_passesnger = no_of_passesnger;
		Bookingreference_no = bookingreference_no;
	}

	public String getFromcity() {
		return fromcity;
	}

	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}

	public String getTocity() {
		return tocity;
	}

	public void setTocity(String tocity) {
		this.tocity = tocity;
	}

	public Date getDate_of_travel() {
		return date_of_travel;
	}

	public void setDate_of_travel(Date date_of_travel) {
		this.date_of_travel = date_of_travel;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public int getNo_of_passesnger() {
		return no_of_passesnger;
	}

	public void setNo_of_passesnger(int no_of_passesnger) {
		this.no_of_passesnger = no_of_passesnger;
	}

	public int getBookingreference_no() {
		return Bookingreference_no;
	}

	public void setBookingreference_no(int bookingreference_no) {
		Bookingreference_no = bookingreference_no;
	}

}
