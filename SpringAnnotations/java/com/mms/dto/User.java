package com.mms.dto;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	
private String user;
@NotNull(message="Please Enter Cityname")
private String city;
@Size(min=2,max=10,message="State name should be in between 2-10 letters")
private String state;
private String degree;
@Past(message="Can not take Future date")
private Date dob;
@Digits(integer=5,fraction=0,message="Zipcode should not exceed 5 digits")
private int zipcode;


public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
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
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}

}
