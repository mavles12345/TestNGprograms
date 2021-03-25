package org.practice;

import org.testng.annotations.Test;

public class Sample7 {
	

	@Test
	private void tc11 () {
	
		System.out.println("11 "+Thread.currentThread().getId());

	}
	
	@Test
	private void tc22() {
		
		System.out.println("22 "+Thread.currentThread().getId());

	}
	
	@Test
	private void tc33() {
		System.out.println("33 "+Thread.currentThread().getId());

	}
	
	@Test
	private void tc44() {
		System.out.println("44 "+Thread.currentThread().getId());

	}
	


}
