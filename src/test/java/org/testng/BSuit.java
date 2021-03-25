package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BSuit {

	@Test()
	private void tc6() {
		Assert.assertTrue(false, "tc6 method is failure");
		System.out.println("11");

	}
	@Test()
	private void tc7() {
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(false, "Tc7 method is failure");
		System.out.println("22");
		s.assertAll(); 
		

	}
	@Test(enabled=false)
	private void tc8() {
		System.out.println("33");

	}
	@Test(groups="smoke")
	private void tc9() {
		System.out.println("44");

	}
	@Test()
	private void tc10() {
		System.out.println("55");

	
}}
