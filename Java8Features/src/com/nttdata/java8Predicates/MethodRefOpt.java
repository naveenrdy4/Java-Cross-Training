package com.nttdata.java8Predicates;

public class MethodRefOpt {
static void foo()
{
	System.out.println("Hello static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greet h=MethodRefOpt::foo;
h.print();
	}

}
