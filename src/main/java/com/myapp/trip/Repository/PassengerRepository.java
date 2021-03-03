package com.myapp.trip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.myapp.trip.model.Passenger;

@RestResource(path = "passenger")
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}