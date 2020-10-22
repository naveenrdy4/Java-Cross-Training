package com.nttdata.java8Predicates;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate <Integer> p=I->(I>25);

	System.out.println(p.test(35));
Function<String,Integer> f=s-> s.length();
System.out.println(f.apply("hello"));
System.out.println(f.apply("helioooo"));
	}

}
