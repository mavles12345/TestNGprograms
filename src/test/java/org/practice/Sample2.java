package org.practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample2 {
	
	@Test(invocationCount=4)
	private void tc11 () {
	
		System.out.println(11);

	}
	
	@Test(groups="Regression")
	private void tc22() {
		
		Assert.assertTrue(false, "Assert get failed");
		
		System.out.println(22);

	}
	
	@Test(groups="Smoke")
	private void tc33() {
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(false, "Assert get failed");
		System.out.println(33);
		//soft.assertAll();

	}
	
	@Test(priority=1)
	private void tc44() {
		System.out.println(44);



}
}