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
}
