package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.CheckoutPage;

public class CheckOutPageTest extends AddToCartTest {

	CheckoutPage checkout;

	public CheckOutPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		checkout = new CheckoutPage();

	}

	@Test
	public void AddToCartTest1() {
		checkout.checkout(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("firstname"),
				prop.getProperty("lastname"), prop.getProperty("postalcode"));

	}

}
