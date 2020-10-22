package com.nttdata.java8Predicates;

public class Message {
Message(String m)
{
	System.out.println(m);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Messager m= Message::new;
m.getMessage("Hello");

	}

}
