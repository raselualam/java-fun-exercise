/* Problem6. Write a java program to find the prime number from 1 to 100 and print them.*/

package com.talentech.assignment2;

public class Problem6 {

	public static void main(String[] args) {
		//myMethod();
		myMethod1();
	}
	/*public static void myMethod(){
		int upperbound = 100;
		for (int number = 2; number <= upperbound; ++number) {

			int maxFactor = (int) Math.sqrt(number);
			boolean isPrime = true;
			int factor = 2;
			while (isPrime && factor <= maxFactor) {
				if (number % factor == 0) {
					isPrime = false;
				}
				++factor;
			}

			if (isPrime)
				System.out.print(number+" ");
		}
	}*/
	public static void myMethod1(){
		for (int a= 1; a<=100; a++){
			double SquareRt = Math.sqrt(a);
			boolean prime= true;
			int factor =2;
			while (prime && factor <= SquareRt){
				if (a % factor==0){
					prime=false;}
			++factor;
				}
			if (prime)
				System.out.print(a+" ");
			
		}
	}
}
