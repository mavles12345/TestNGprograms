package org.paralleltest;

import org.testng.annotations.Test;

public class ParallerlTc3 {
	
	@Test
	private void tc7() {
	System.out.println("7="+Thread.currentThread().getId());

	}
	
	@Test
	private void tc8() {
		System.out.println("8="+Thread.currentThread().getId());

	}
	
	@Test
	private void tc9() {
		System.out.println("9="+Thread.currentThread().getId());


}

}
