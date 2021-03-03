package com.myapp.trip.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.myapp.trip.model.User;

@Transactional
@RestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {

}