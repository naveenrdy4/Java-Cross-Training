package com.nttdata.java8Predicates;

import java.util.function.BiFunction;

public class Addition {

	
	static int add(int a,int b)
	{
		return a+b;
		
	}
	
	static float add1(int a,float b)
	{
		return a+b;
	}
	static double add2(double a,double b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BiFunction<Integer,Integer,Integer> add=Addition::add;
	int r=add.apply(10, 20);
	System.out.println("Addition "+r);
	
	BiFunction<Integer,Float,Float> add1=Addition::add1;
	float res1=add1.apply(20, 20.2f);
	System.out.println("Addition "+res1);
	
	BiFunction<Double,Integer,Double> add2=Addition::add2;
	double res2=add2.apply(20.2, 20);
	System.out.println("Addition "+res2);
	}

}
