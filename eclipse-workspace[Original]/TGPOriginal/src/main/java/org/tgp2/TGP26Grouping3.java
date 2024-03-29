package org.tgp2;

import org.testng.annotations.Test;

@Test(groups = {"Apple"})
public class TGP26Grouping3 {

	@Test(groups= {"Mango"})
	public void method1() {
		System.out.println("Apple,Mango,method1");
			}
	
	@Test()
	public void method2() {
		System.out.println("Apple,method2");

	}
}
