package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleTests {
	
	private static Sample sample;
	
	@BeforeAll
	static void beforeAll() {
		sample = new Sample();
	}

	@Test
	void numTest() {
		int actual;
		int expected;
		
		actual = sample.sum();
		expected = 3;
		assertEquals(actual, expected);
	}
	
	@Test
	void mojiTest() {
		String actual;
		String expected;
		
		actual = sample.moji();
		expected = "Hello World!";
		assertEquals(actual, expected);
	}
}
