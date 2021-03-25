package org.paralleltest;

import org.testng.annotations.Test;

public class ParallerlTc2 {
	
	
	@Test
	private void tc4() {
	System.out.println("4="+Thread.currentThread().getId());

	}
	
	@Test
	private void tc5() {
		System.out.println("5="+Thread.currentThread().getId());

	}
	
	@Test
	private void tc6() {
		System.out.println("6="+Thread.currentThread().getId());


}
}