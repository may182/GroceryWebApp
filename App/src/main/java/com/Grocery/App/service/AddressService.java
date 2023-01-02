package com.Grocery.App.service;

import com.Grocery.App.model.Address;

public interface AddressService {
	public Address saveAddress(Address address);
	public int deleteAddress(Address address);
	public Address modifyAddress(Address address);
}
