package com.thoughtworks.tdd;

import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzNumberGameTest {	
	@Test
	public void should_return_1_when_fizzBuzz_given_3() {
		int number = 1;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		String word = fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("1", word);
		}
	@Test
	public void should_return_Fizz_when_fizzBuzz_given_3() {
		int number = 3;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		String word = fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("Fizz", word);
		}
	@Test
	public void should_return_Fizz_when_fizzBuzz_given_5() {
		int number = 7;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		String word = fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("Whizz", word);
		}
	@Test
	public void should_return_Fizz_when_fizzBuzz_given_7() {
		int number = 7;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		String word = fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("FizzBuzzWhizz", word);
		}
}
