package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddToCartPage;

public class AddToCartTest extends TestBase {
	AddToCartPage addtocart;

	public AddToCartTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		addtocart = new AddToCartPage();

	}

	@Test
	public void AddToCartTest1() {
		addtocart.addtocart(prop.getProperty("username"), prop.getProperty("password"));

	}

}
