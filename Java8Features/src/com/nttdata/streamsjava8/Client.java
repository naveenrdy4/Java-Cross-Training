package com.nttdata.streamsjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Product> list=new ArrayList<>();
list.add(new Product(101,"Parle",200));
list.add(new Product(134,"Bourbon",220));
list.add(new Product(202,"Sunfeast",320));
list.add(new Product(131,"Lotte",620));
list.add(new Product(441,"MilkBicks",210));
list.add(new Product(741,"Tiger",750));
list.add(new Product(652,"Unibic",185));
// without using streams
for (Product product : list) {
if(product.price<350)
	System.out.println("product prices are "+ product.price);
}
// with using streams
List<Double>d=list.stream().filter(p->p.price<350).map(p->p.price).collect(Collectors.toList());
	System.out.println(d);
	//Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(5).forEach(System.out::println);
System.out.println("Product price less than 350");	
list.stream().filter(p->p.price>350).forEach(p->System.out.println(p.price));
System.out.println("Total price of products");
Double dd=list.stream().map(p->p.price).reduce(0.0, (sum,price)->(sum+price));
System.out.println(dd);
System.out.println("Biscuit Brands");
String s=list.stream().map(p->p.pname).reduce("",(res,pname)-> (res+" "+pname));
System.out.println(s);
System.out.println("Discount of 10% for pricing abouve 350");
list.stream().filter(p->p.price>350).forEach(p->System.out.println(p.price-(p.price*10/100)));
	

	}

}
