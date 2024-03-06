package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class AddToCartPage extends TestBase {

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	@FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
	WebElement itemprice;

	@FindBy(xpath = "(//div[@class = 'inventory_item_name '])[1]")
	WebElement itemname;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;

	@FindBy(xpath = "//a[@class = 'shopping_cart_link']")
	WebElement cartlink;

	@FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
	WebElement inventname;

	@FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
	WebElement inventprice;

	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void addtocart(String un, String pwd) {

		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		String text1 = itemname.getText();
		String text2 = itemprice.getText();
		addtocart.click();
		cartlink.click();
		String text3 = inventname.getText();
		String text4 = inventprice.getText();

		Assert.assertEquals(text1, text3, "Item Prices are NOT equal.");
		System.out.println("Item Prices are equal.");

		Assert.assertEquals(text2, text4, "Item Names are NOT equal.");
		System.out.println("Item Names are equal.");

	}

}