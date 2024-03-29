package org.tgp2;

import org.testng.annotations.Test;

public class TGP21 {

	@Test(groups= {"Regression"})
	public void createLead() {
		System.out.println("CreateLead");
	}

	@Test(groups="Smoke")
	public void editLead() {
		System.out.println("EditLead");
	}
	
	@Test(groups="Sanity")
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
}
