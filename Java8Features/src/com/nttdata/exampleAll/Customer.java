package com.nttdata.exampleAll;

public class Customer {
int cid;
String cname;
String city;
double tprice;
String password;
public Customer(int cid, String cname, String city, double tprice, String password) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.city = city;
	this.tprice = tprice;
	this.password = password;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getTprice() {
	return tprice;
}
public void setTprice(double tprice) {
	this.tprice = tprice;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Customer [Customer id=" + cid + ", Customer Name=" + cname + ", City=" + city + ", Total price=" + tprice + ", Password="
			+ password + "]";
}

}
