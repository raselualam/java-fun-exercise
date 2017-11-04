/* Problem3. Write two java functions which will return two different integer values, 
write a program to compare those numbers and send message that one number is bigger than other. 
(hints: using if..else)*/

package com.talentech.assignment2;

public class Problem3 {
	
	public static int a;
	public static int b;
	
	public static void main(String[] args) {
		a = myFunction1();
		b = myFunction2();
		myMethod();
		
	}
	
	public static int myFunction1(){
		return 1;
	}
	public static int myFunction2(){
		return 3;
	}
	public static void myMethod(){
		if(a==b){
			System.out.println("Numbers are equal");}
		else if (a>b){
			System.out.println("Number1 is bigger then Number2");}
		else if (a<b){
			System.out.println("Number1 is smaller then Number2");}
	}
}
