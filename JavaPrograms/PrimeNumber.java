package com.vector;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=15;
		int c=0;
		int i=2;
		while( i<=num/2) {
//		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				c++;
				break;
			}
			i++;
		}
//		}
		if(c==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");	
		}

	}

}
