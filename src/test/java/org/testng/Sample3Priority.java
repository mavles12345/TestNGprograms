package org.testng;

import org.testng.annotations.Test;

public class Sample3Priority {

	@Test(priority=1)
	private void tc1() {
		System.out.println("1");

	}
	@Test(priority=2)
	private void tc2() {
		System.out.println("2");

	}
	@Test(enabled=false)
	private void tc3() {
		System.out.println("3");

	}
	@Test(priority=-2)
	private void tc4() {
		System.out.println("4");

	}
	@Test(priority=-1)
	private void tc5() {
		System.out.println("5");

	}
	
	
	
}
