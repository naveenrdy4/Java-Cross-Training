package com.nttdata.featuresgreet;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="naveen";
		Greet g1=(s1)->{System.out.println(s1+" Hello");};
		g1.greeting(name);	
		
		String name1="reddy";
		Greet g2=(s2)->{System.out.println(s2+" Hello");};
		g2.greeting(name1);	
}

}
