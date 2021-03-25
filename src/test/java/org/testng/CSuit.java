package org.testng;

import org.testng.annotations.Test;

public class CSuit {

	@Test(groups="smoke")
	private void tc11() {
		System.out.println("111");

	}
	@Test()
	private void tc12() {
		System.out.println("222");

	}
	@Test(enabled=false)
	private void tc13() {
		System.out.println("333");

	}
	@Test()
	private void tc14() {
		System.out.println("444");

	}
	@Test(invocationCount=4)
	private void tc15() {
		System.out.println("555");

	
}}
