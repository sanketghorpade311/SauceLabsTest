package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends AddToCartPage {

	AddToCartPage ac = new AddToCartPage();

	@FindBy(id = "checkout")
	WebElement Checkoutbtn;

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(id = "postal-code")
	WebElement postalcode;

	@FindBy(id = "continue")
	WebElement Continuebtn;

	@FindBy(id = "finish")
	WebElement finishbtn;

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkout(String un, String pwd, String Firstname, String Lastname, String zipcode) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		System.out.println("Logged IN");
		addtocart.click();
		String text1 = itemname.getText();
		String text2 = itemprice.getText();
		cartlink.click();
		System.out.println("Added to cart");

		System.out.println("Cart Link Opened");
		String text3 = inventname.getText();
		String text4 = inventprice.getText();
		Checkoutbtn.click();
		Assert.assertEquals(text1, text3, "Item Prices are NOT equal.");
		System.out.println("Item Prices are equal.");

		Assert.assertEquals(text2, text4, "Item Names are NOT equal.");
		System.out.println("Item Names are equal.");

		System.out.println("Checkout Button Clicked");
		firstname.sendKeys(Firstname);
		System.out.println("Name Sanket entered");
		lastname.sendKeys(Lastname);
		System.out.println("Lastname Ghorpade entered");
		postalcode.sendKeys(zipcode);
		System.out.println("Details entered");
		Continuebtn.click();
		System.out.println("Continue button clicked");
		finishbtn.click();
		System.out.println("Completed");
	}

}
