package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Util {

    @FindBy(id = "products-orderby")
    WebElement _sortByDropDown;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement _desktopTextOnDesktopPage;

    @FindBy(id = "add-to-cart-button-1")
    WebElement _addToCartBtn;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement _buildYourOwnText;


    String zToA = "Name: Z to A";

    public void clickOnSortByDropDown() {
        clickOnElement(_sortByDropDown);
    }


    public void buildYourOwnLink() {
        clickOnElement(_buildYourOwnText);
    }

    public void selectZtoA() {
        selectByVisibleTextFromDropDown(_sortByDropDown, zToA);
    }

    public void scrollDownDesktopPage(int i) {
        scrollUpDown(i);
    }

    public void clickOnAddToCartBtn() {

        clickOnElement(_addToCartBtn);
    }
public void clickOnDesktopLink(){
        clickOnElement(_desktopTextOnDesktopPage);
}
    public String getDesktopText() {

        return getTextFromElement(_desktopTextOnDesktopPage);
    }
}

