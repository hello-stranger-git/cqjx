package cqjxBackstage.com.cqjx.domain;

public class rczp {
private String uuid;
private String rczptype;
private String rczpcontent;

private String rczpImageName;

public String getRczpImageName() {
	return rczpImageName;
}
public void setRczpImageName(String rczpImageName) {
	this.rczpImageName = rczpImageName;
}
@Override
public String toString() {
	return "rczp [uuid=" + uuid + ", rczptype=" + rczptype + ", rczpcontent=" + rczpcontent + "]";
}
public rczp() {
	super();
	// TODO Auto-generated constructor stub
}
public rczp(String uuid, String rczptype, String rczpcontent) {
	super();
	this.uuid = uuid;
	this.rczptype = rczptype;
	this.rczpcontent = rczpcontent;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getRczptype() {
	return rczptype;
}
public void setRczptype(String rczptype) {
	this.rczptype = rczptype;
}
public String getRczpcontent() {
	return rczpcontent;
}
public void setRczpcontent(String rczpcontent) {
	this.rczpcontent = rczpcontent;
}
}
