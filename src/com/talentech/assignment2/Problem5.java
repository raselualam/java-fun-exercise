/* Problem5. Write a program in Java to display the multiplication table of (eight)8.*/

package com.talentech.assignment2;

public class Problem5 {

	public static void main(String[] args) {
		Problem5 obj= new Problem5();
		obj.myMethod1();
		
		//myMethod2();
	
	}

	/*public static void myMethod2() {
	
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 8; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}*/
	public void myMethod1(){
		for (int a=1; a<=10; a++){
			System.out.print(a*8+" ");
		}
		
	}
}