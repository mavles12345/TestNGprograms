package org.secondpractice;

import org.testng.annotations.Test;

public class PracticeGroup2 {

	@Test(groups="Sanity")
	private void tc111() {

		System.out.println("I am 111");

	}

	@Test(groups="Regression")
	private void tc12() {
		System.out.println("I am 122");

	}

	@Test(groups="Smoke")
	private void tc13() {
	System.out.println("I am 133");


}
}
	

