package cqjxBackstage.com.cqjx.domain;

public class user {
private String uuid;
private String username;
private String password;
@Override
public String toString() {
	return "user [uuid=" + uuid + ", username=" + username + ", password=" + password + "]";
}
public user(String uuid, String username, String password) {
	super();
	this.uuid = uuid;
	this.username = username;
	this.password = password;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
