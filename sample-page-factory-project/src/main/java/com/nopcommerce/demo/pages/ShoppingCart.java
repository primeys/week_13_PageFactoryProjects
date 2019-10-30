package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends Util {
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement _shoppingCartLink;

    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement _confirmationTxtShopCart;

    public void clickOnShoppingCart() {
        clickOnElement(_shoppingCartLink);
    }

    public String verifyWelcomeText() {
        return getTextFromElement(_confirmationTxtShopCart);
    }

}


