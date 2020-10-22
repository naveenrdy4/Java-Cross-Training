package com.nttdata.featuresjava8;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a1=(a,b)->{System.out.println("Addition of two numbers "+(a+b));};
		a1.calc(21, 22);
		Calculator a2=(a,b)->{System.out.println("Subtraction of two numbers "+(b-a));};
		a2.calc(21,22);
		
		Calculator a3=(a,b)->{System.out.println("Multiplication of two numbers "+(a*b));};
a3.calc(21,22);
		
		Calculator a4=(a,b)->{System.out.println("Division of two numbers "+(a/b));};
a4.calc(48, 24);

System.out.println();
System.out.println();

//using return type
CalculatorReturn b1=(a,b)->{ return(a+b);};
int i1=b1.cal(21,22);
System.out.println("Addition of 2 numbers "+i1);
CalculatorReturn b2=(a,b)->{ return(a*b);};
int i2=b2.cal(21,22);
System.out.println("Multiplication of 2 numbers "+i2);
CalculatorReturn b3=(a,b)->{ return(b-a);};
int i3=b3.cal(21,22);
System.out.println("Subtraction of 2 numbers "+i3);
CalculatorReturn b4=(a,b)->{ return(a/b);};
int i4=b4.cal(48,24);
System.out.println("Addition of 2 numbers "+i4);

	}

}
