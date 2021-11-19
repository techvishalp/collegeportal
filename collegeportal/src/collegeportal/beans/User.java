package collegeportal.beans;

public class User {
private int id;
private String password;
private String type;
private String userid;

public User(String userid) {
	super();
	this.userid = userid;
}
public String getUserid() {
	return userid;
}
public User(String password, String type, String userid) {
	super();
	this.password = password;
	this.type = type;
	this.userid = userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public int getId() {
	return id;
}
public User(int id, String password, String type) {
	super();
	this.id = id;
	this.password = password;
	this.type = type;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public void setPassword(String password) {
	this.password = password;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
