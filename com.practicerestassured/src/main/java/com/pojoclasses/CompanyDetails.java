package com.pojoclasses;

public class CompanyDetails {
private String companayName;
private String email;


public CompanyDetails(String companayName, String email) {
	super();
	this.companayName = companayName;
	this.email = email;
}
public String getCompanayName() {
	return companayName;
}
public void setCompanayName(String companayName) {
	this.companayName = companayName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
