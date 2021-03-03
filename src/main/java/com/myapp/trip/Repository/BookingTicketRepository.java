package com.myapp.trip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.myapp.trip.model.BookingTicket;

@RestResource(path = "Booking-details")
public interface BookingTicketRepository extends JpaRepository<BookingTicket, Integer> {

}