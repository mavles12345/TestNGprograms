package org.practice;

import org.testng.annotations.Test;

public class Sample6 {
	
	@Test
	private void tc1 () {
	
		System.out.println("1 " + Thread.currentThread().getId());

	}
	
	@Test
	private void tc2() {
		
		System.out.println("2 " +Thread.currentThread().getId());

	}
	
	@Test
	private void tc3() {
		System.out.println("3 " +Thread.currentThread().getId());

	}
	
	@Test
	private void tc4() {
		System.out.println("4 " +Thread.currentThread().getId());

	}
	
	



}
