package org.tgp2;

import org.testng.annotations.Test;

public class TGP23Attributes {

	@Test(dependsOnMethods="method2",alwaysRun=true)
	public void method1() {
		System.out.println("Method1");
	}
	
	@Test(enabled=true,dependsOnGroups="Regression1")
	public void method2() {
		System.out.println("Method2");
	}
	
	@Test(groups={"Regression1"})
	public void method3() {
		System.out.println("Method3");
	}
	
	@Test(invocationCount=5)
	public void method4() {
		System.out.println("Method4");
	}
	
	@Test(priority=-1)
	public void method5() {
		System.out.println("Method5");
	}
	@Test(priority=2)
	public void method6() {
		System.out.println("Method6");
	}
}
