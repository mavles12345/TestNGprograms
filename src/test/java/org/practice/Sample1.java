package org.practice;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	private void tc1 () {
	
		System.out.println(1);

	}
	
	@Test(groups="Sanity")
	private void tc2() {
		
		System.out.println(2);

	}
	
	@Test(dataProvider="dataCollection",dataProviderClass=Sample4.class)
	private void tc3(String a, String b) {
		System.out.println(a+b);

	}
	
	@Test(priority=-1)
	private void tc4() {
		System.out.println(4);

	}
	
	

}
