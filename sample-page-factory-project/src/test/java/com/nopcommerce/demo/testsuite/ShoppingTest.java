package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ShoppingCart;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {

    @Test (groups = "regression")
    public void userShouldNavigateToShoppingTestSuccessfully() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.clickOnShoppingCart();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCart.verifyWelcomeText(), expectedText);
    }
}
