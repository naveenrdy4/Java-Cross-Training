package com.nttdata.exampleAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nttdata.streamsjava8.Product;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(120,"Naveen","Hyd",27000));
		list.add(new Employee(102,"Mohit","Hyd",35000));
		list.add(new Employee(103,"Anny","Mysore",17000));
		list.add(new Employee(104,"Bairstow","England",15000));
		list.add(new Employee(105,"Warner","Aus",24000));
		list.add(new Employee(106,"Anish","Mysore",27200));
		list.add(new Employee(101,"Anu","Banglore",24000));
		list.add(new Employee(108,"Shannu","Mysore",17000));
		list.add(new Employee(109,"Kane","Hyd",20000));
		list.add(new Employee(110,"Anish","Mysore",18000));
		list.add(new Employee(111,"Tanay","Banglore",19000));
		list.add(new Employee(112,"Sachin","Mumbai",20000));
		list.add(new Employee(113,"VVS","Hyd",15000));
		list.add(new Employee(107,"Sindhu","Hyd",17000));
		list.add(new Employee(114,"MAri kom","Tripura",27000));
		list.add(new Employee(115,"Smrithi","Mumbai",15000));
System.out.println("Number of employees whose salary is in between 10000 and 20000 and increment of their salary by 5%");
list.stream().filter(p->(p.salary>10000 && p.salary<20000)).forEach(p->System.out.println(p.salary+(p.salary*5/100)));
System.out.println("number of employees at each location");
Map<String,Long> c=list.stream().collect(Collectors.groupingBy(Employee::getAdd,Collectors.counting()));
System.out.println(c);
double d=list.stream().map(p->p.salary).reduce(0.0,(sum,salary)->(sum+salary));
System.out.println("Total salary of all employees ");
System.out.println(d);

	
	}

}
