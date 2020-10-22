package com.nttdata.exampleAll;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//import com.nttdata.collectionsqueue.Book;
import com.nttdata.streamsjava8.Product;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Map<Integer,Customer> list=new HashMap<>();
		Encoder ben=Base64.getEncoder();

		list.put(1,new Customer(101,"Naveen","hyd",2000, ben.encodeToString("verygood".getBytes())));
		list.put(2,new Customer(102,"Mohit","hyd",2500,ben.encodeToString("good".getBytes())));
		list.put(3,new Customer(222,"Anu","banglore",6000,ben.encodeToString("cehiyce".getBytes())));
		list.put(4,new Customer(233,"Tanay","Mysore",2600,ben.encodeToString("ceiuchei".getBytes())));
		list.put(5,new Customer(121,"Anish","KP",2100,ben.encodeToString("cenuifie".getBytes())));
		list.put(6,new Customer(231,"Anny","Kerla",2000,ben.encodeToString("hhbjhegiu".getBytes())));
		list.put(7,new Customer(101,"Kane","NZ",7500,ben.encodeToString("cejhoice".getBytes())));
		list.put(8,new Customer(321,"Chak","kur",2300,ben.encodeToString("cekuhe".getBytes())));
		list.put(9,new Customer(444,"Reddy","Hyd",2000,ben.encodeToString("ceyceiu".getBytes())));
		list.put(10,new Customer(324,"Tanu","Mysore",2000,ben.encodeToString("efhiue".getBytes())));
		list.put(11,new Customer(222,"Shanu","J&K",5640,ben.encodeToString("cekciu".getBytes())));
		list.put(12,new Customer(635,"Kholi","Delhi",8500,ben.encodeToString("feygyid".getBytes())));
		list.put(13,new Customer(701,"Warner","Aus",6000,ben.encodeToString("deuihiuhe".getBytes())));
		list.put(14,new Customer(555,"Bairstow","Eng",9000,ben.encodeToString("eeuefnu".getBytes())));
		list.put(15,new Customer(226,"Chahal","Baanglore",8000,ben.encodeToString("eygdey".getBytes())));
		list.put(16,new Customer(701,"Sindhu","hyd",2500,ben.encodeToString("ejeccev".getBytes())));
		list.put(17,new Customer(653,"Mari kom","Tripura",8000,ben.encodeToString("yfehuf".getBytes())));
		list.put(18,new Customer(654,"Smrithi","Delhi",2000,ben.encodeToString("HGdiegwiuhf".getBytes())));
		list.put(19,new Customer(234,"Sahin","Mumbai",9000,ben.encodeToString("yegfjb".getBytes())));
		list.put(20,new Customer(332,"VVS","hyd",2000,ben.encodeToString("hjgefy".getBytes())));
	/*	for(Map.Entry<Integer, Customer> m :list.entrySet())
		{
			System.out.println("key is  "+m.getKey()+"\t"+"Value is: "+m.getValue() );
		}
*/
		/*list.forEach( Map.Entry<Integer,Customer> e -> {
		       System.out.println("Key : " + e.getKey() + " Value : " + e.getValue());

		   }); 
*/
		list.forEach((key, value) -> {
		    System.out.println("Key : " + key + " Value : " + value);
		});
System.out.println("number of people located in hyd");
long a=list.entrySet().stream().filter(p->p.getValue().getCity().equals("hyd")).count();
System.out.println(a);
Map.Entry<Integer,Customer> c=list.entrySet().stream().max((p1,p2)->p1.getValue().getTprice()<p2.getValue().getTprice()?-1:1).get();		
	System.out.println("Max purchase by customer details "+c);
	Map.Entry<Integer,Customer> d=list.entrySet().stream().max((p1,p2)->p1.getValue().getTprice()>p2.getValue().getTprice()?-1:1).get();		
	System.out.println("Min purchase by customer details "+c);

	System.out.println(d);
//	String enString=ben.encodeToString(list.entrySet().map(p->p.getValue().getPassword().getBytes()));
	//String enString=ben.encodeToString(list.)
		//	Map<Integer,Customer> map = ...
			//String encoded = Base64.encode(map);
			//Map<Integer,String> map = Base64.decode(encoded);
	}

}
