package com.nttdata.exampleAll;

public class Employee {
int eid;
String ename;
String add;
double salary;
public Employee(int eid, String ename, String add, double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.add = add;
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
