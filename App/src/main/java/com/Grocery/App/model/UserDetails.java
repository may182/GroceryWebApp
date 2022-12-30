package com.Grocery.App.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class UserDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public int userId;
  public String firstName;
  public String lastName;
  public Date dateOfBirth;
  public String phoneNumber;

  @OneToMany
  public List<Address> address;

  @OneToOne
  private User user;

  @OneToMany
  private List<Order> orderList;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
