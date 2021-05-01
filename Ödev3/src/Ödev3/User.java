package Ödev3;

public class User {

private	int id;
private	String firstName;
private	String lastName;
private	String userName;
private	String userType;

public User() {
	
}


public User( int id, String firstName, String lastName, String userName, String userType) {
	this.id = id;
	this.firstName = lastName;
	this.lastName = lastName;
	this.userName = userName;
	this.userType = userType;
	}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
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


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getUserType() {
	return userType;
}


public void setUserType(String userType) {
	this.userType = userType;
}
}

