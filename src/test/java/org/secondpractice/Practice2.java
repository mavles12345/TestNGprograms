package org.secondpractice;

import org.testng.annotations.Test;

public class Practice2 {
	
	@Test(dataProvider="dataAdd", dataProviderClass=Practice3.class)
	private void Tc04(String a, String b) {
		
		System.out.println(a+b);
	
	}

}
