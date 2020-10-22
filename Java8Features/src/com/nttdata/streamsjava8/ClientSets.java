package com.nttdata.streamsjava8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ClientSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Product> list=new TreeSet<>((p1,p2)->p1.getPname().compareTo(p2.getPname()));
		list.add(new Product(101,"Parle",200));
		list.add(new Product(134,"Bourbon",220));
		list.add(new Product(202,"Sunfeast",320));
		list.add(new Product(131,"Lotte",620));
		list.add(new Product(441,"MilkBicks",210));
		list.add(new Product(741,"Tiger",750));
		list.add(new Product(652,"Unibic",185));
		list.add(new Product(741,"Tiger",750));
		list.add(new Product(741,"Tiger",750));

		//Set<Double> d1=list.stream().filter(p->p.price>350).map(p->p.price).collect(Collectors.toSet());
	/*for (Product product : list) {
	System.out.println(product.pname);	
	}*/
list.forEach(s->System.out.println(s));
	}

}
