package org.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Manualfailrun {

	@Test
	private void tc111() {

		System.out.println("111");

	}

	@Test
	private void tc222() {
		Assert.assertTrue(false, "test case failed"); 

		System.out.println("222");

	}

	@Test
	private void tc333() {
		System.out.println("333");

	}

	@Test
	private void tc444() {
		System.out.println("444");

	}

}
