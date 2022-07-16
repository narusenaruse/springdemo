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
	void test() {
		int actual;
		int expected;
		
		actual = sample.sum();
		expected = 3;
		assertEquals(actual, expected);
	}
}
