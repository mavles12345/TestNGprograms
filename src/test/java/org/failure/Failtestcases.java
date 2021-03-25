package org.failure;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failtestcases {

	
	@Test
	private void tc1() {
	
	System.out.println("11");

	}

	@Test
	private void tc2() {
	Assert.assertTrue(true, "TC2 is failure");
	System.out.println("12");

	}

	@Test
	private void tc3() {
	System.out.println("13");

	}

	@Test
	private void tc4() {
	System.out.println("14");

	}

}
