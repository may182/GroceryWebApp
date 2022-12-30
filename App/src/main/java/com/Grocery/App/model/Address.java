package com.Grocery.App.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Address {

  //One to many mapping with user Details
  @Id
  public int addressId;

  public String country; //Drop down required
  public String line1;
  public String line2;
  public String city; //Drop down required
  public String state;
  public String pinCode;
  public String alternatePhoneNumber;


  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  public String getAlternatePhoneNumber() {
    return alternatePhoneNumber;
  }

  public void setAlternatePhoneNumber(String alternatePhoneNumber) {
    this.alternatePhoneNumber = alternatePhoneNumber;
  }
}
