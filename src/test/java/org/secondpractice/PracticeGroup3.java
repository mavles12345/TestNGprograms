package org.secondpractice;

import org.testng.annotations.Test;

public class PracticeGroup3 {

	
	@Test(groups="Sanity")
	private void tc1111() {

		System.out.println("I am 1111");

	}

	@Test(groups="Regression")
	private void tc1222() {
		System.out.println("I am 1222");

	}
	@Test(groups="Smoke")
	private void tc1333() {
	System.out.println("I am 1333");


}
}

