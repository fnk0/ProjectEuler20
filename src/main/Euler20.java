package main;

import java.math.BigInteger;

public class Euler20 {

	public static void main(String[] args) {
		
		BigInteger factorial = new BigInteger("1");
		
		for(Integer i = 100; i > 0 ; i--) {
			
			factorial = factorial.multiply(new BigInteger(i.toString()));
		}
		
		System.out.println(factorial);
		
		String sumString = factorial.toString();
		
		int sum = 0;
		
		for(int i = 0; i < sumString.length(); i++) {
			
			sum += Integer.parseInt("" + sumString.charAt(i));
		}
		
		System.out.println(sum);
	}
}
