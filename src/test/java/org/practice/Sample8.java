package org.practice;

import org.testng.annotations.Test;

public class Sample8 {
	

	@Test
	private void tc111 () {
	
		System.out.println("111 " +Thread.currentThread().getId());

	}
	
	@Test
	private void tc222() {
		
		System.out.println("222 "+Thread.currentThread().getId());

	}
	
	@Test
	private void tc333() {
		System.out.println("333 "+Thread.currentThread().getId());

	}
	
	@Test
	private void tc444() {
		System.out.println("444 "+Thread.currentThread().getId());

	}
	


}
