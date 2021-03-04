package com.myapp.trip.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.myapp.trip.model.Flight;

@Transactional
@RestResource(path = "flight")
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}