package com.Grocery.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Grocery.App.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
