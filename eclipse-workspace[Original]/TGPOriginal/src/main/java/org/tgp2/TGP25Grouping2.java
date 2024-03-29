package org.tgp2;

import org.testng.annotations.Test;

public class TGP25Grouping2 {
	@Test(groups= {"Apple"})
	public void method1() {
		System.out.println("Apple");
	}
	
	@Test(groups= {"Mango"})
	public void method2() {
		System.out.println("Mango");
	}

}
