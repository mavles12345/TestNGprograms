package org.secondpractice;

import org.testng.annotations.Test;

public class PracticeGroup1 {
	
	
	@Test(groups="Sanity")
	private void tc11() {

		System.out.println("I am 11");

	}

	@Test(groups="Regression")
	private void tc12() {
		System.out.println("I am 12");

	}

	@Test(groups="Smoke")
	private void tc13() {
	System.out.println("I am 13");


}
}
