package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {
	
	public String fizzBuzz(int number) {
		String result = "0";
		if(number%3==0 && number%5==0 && number%7==0) {
			result = "FizzBuzzWhizz";
		}			
		else if(number == 1) {
			result = "1";
		}
		else if(number%3 == 0) {
			result = "Fizz";
		}
//		else if(number%5 == 0) {
//			result = "Buzz";
//		}
//		else if(number%7 == 0) {
//			result = "Whizz";
//		}
		return result;		
	}
}
