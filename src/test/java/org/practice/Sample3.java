package org.practice;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(invocationCount=4)
	private void tc111 () {
	
		System.out.println(111);

	}
	
	@Test(enabled=false)
	private void tc222() {
		
		System.out.println(222);

	}
	
	@Test(groups="Sanity")
	private void tc333() {
		System.out.println(333);

	}
	
	@Test(priority=1)
	private void tc444() {
		System.out.println(444);



}
}