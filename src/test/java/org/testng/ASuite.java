package org.testng;

import org.testng.annotations.Test;

public class ASuite {
	
	
	@Test(dataProvider="selvam", dataProviderClass=ParameterTC2.class)
	private void tc1(String a, String b) {
		System.out.println(a+b);

	}
	@Test()
	private void tc2() {
		System.out.println("2");

	}
	@Test(enabled=false)
	private void tc3() {
		System.out.println("3");

	}
	@Test(groups="smoke")
	private void tc4( ) {
		System.out.println("4");

	}
	@Test(priority=-1)
	private void tc5() {
		System.out.println("5");

	

}}
