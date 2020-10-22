package com.nttdata.listjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
int empid;
String empname;
public Employee(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
public static void main(String[] args) {
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(101,"naveen"));
	list.add(new Employee(121,"tanu"));
	list.add(new Employee(111,"tanay"));
	list.add(new Employee(141,"shanu"));
	list.add(new Employee(111,"anish"));
	list.add(new Employee(111,"anny"));
Collections.sort(list, (e1,e2)->{
	return e1.empname.compareTo(e2.empname);
});
for (Employee employee : list) {
	System.out.println("names sorted are:  "+employee.empname);
	
	
}

	




}
}
