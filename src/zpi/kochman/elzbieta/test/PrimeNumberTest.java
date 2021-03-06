package zpi.kochman.elzbieta.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zpi.kochman.elzbieta.imp.PrimeNumber;

public class PrimeNumberTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addValueToListAndReturnSizeTest() {
		assertNotEquals(0, PrimeNumber.addValueToListAndReturnSize(1L, new ArrayList<Long>()));
	}
	
	@Test
	public void calculateNextPrimeNumberOfThisTest(){
		long number = 7;
		assertTrue(number < PrimeNumber.calculateNextPrimeNumberOfThis(number));
		assertEquals(PrimeNumber.calculateNextPrimeNumberOfThis(number),11);
	}
	
	@Test
	public void calculateNPrimeNumbersTest(){
		int numberOfPrimesToCalculate = 100;
		assertNotNull(PrimeNumber.getNPrimeNumbers(numberOfPrimesToCalculate));
		assertEquals(numberOfPrimesToCalculate, PrimeNumber.getNPrimeNumbers(numberOfPrimesToCalculate).size());
	}
	

}
