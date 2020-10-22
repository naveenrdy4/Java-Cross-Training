package com.nttdata.java8Predicates;

public class MethodRefInstance {
 
	void hello()
	{
	System.out.println("This is instance method");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodRefInstance m=new MethodRefInstance();
Welcome w=m::hello;
w.greeting();

	}

}
