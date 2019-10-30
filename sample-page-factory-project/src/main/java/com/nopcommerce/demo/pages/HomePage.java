package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePage extends Util {

    @FindBy(linkText = "Register")
    WebElement _registerLink;

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(id = "customerCurrency")
    WebElement _customerCurrencyEuro;

    @FindBy(className = "wishlist-label")
    WebElement _wishlistLink;

    @FindBy(name = "Shopping cart")
    WebElement _shoppingCartLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computersLink;

    @FindBy(name = "Electronics ")
    WebElement _electronicsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement _apparelLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement _digitalDownloads;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement _bookLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement _jewelryLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement _giftCardsLink;


    public void clickOnLoginLink() {
        clickOnElement(_loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(_registerLink);
    }

    public void selectCurrency(String euro) {
        clickOnElement(_customerCurrencyEuro);
    }

    public void clickOnWishListLink() {
        clickOnElement(_wishlistLink);
    }

    public void clickOnShoppingCart(){
        clickOnElement( _shoppingCartLink);
    }

    public void clickOnComputers(){
        clickOnElement(_computersLink);
    }

    public void clickOnElectronics(){
        clickOnElement(_electronicsLink);
    }

    public void clickOnApparel(){
        clickOnElement(_apparelLink);
    }

    public void clickOnDigitalDownloads(){
        clickOnElement(_digitalDownloads);
    }

    public void clickOnBooks(){
        clickOnElement(_bookLink);
    }

    public void clickOnJewelry(){
        clickOnElement(_jewelryLink);
    }

    public void clickOnGiftCrads(){
        clickOnElement(_giftCardsLink);
    }
}