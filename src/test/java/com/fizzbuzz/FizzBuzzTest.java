package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }

    @Test
    public void testGetNumber() {
        FizzBuzz fizzBuzzTester = new FizzBuzz(5);
        assertEquals(5, fizzBuzzTester.getNumber());
    }

    @Test
    public void testSetNumber() {
        FizzBuzz fizzBuzzTester = new FizzBuzz(99);
        fizzBuzzTester.setNumber(2);
        assertEquals(2, fizzBuzzTester.getNumber());
    }

    @Test
    public void testPrinter() {
        
    }

    @Test
    public void testFizz() {
        FizzBuzz fizzBuzzTester = new FizzBuzz(12);
        assertEquals("Fizz", fizzBuzzTester.fizz());
    }

    @Test
    public void testBuzz() {
        FizzBuzz fizzBuzzTester = new FizzBuzz(25);
        assertEquals("Buzz", fizzBuzzTester.buzz());
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzzTester = new FizzBuzz(15);
        assertEquals("FizzBuzz", fizzBuzzTester.fizzBuzz());
    }

	@Test
	public void testBuzz2() {
		FizzBuzz fizzBuzzTester = new FizzBuzz(50);
        assertEquals("Buzz", fizzBuzzTester.buzz2());
	}

	@Test
	public void testFizz2() {
		FizzBuzz fizzBuzzTester = new FizzBuzz(30);
        assertEquals("Fizz", fizzBuzzTester.fizz2());
	}

}
