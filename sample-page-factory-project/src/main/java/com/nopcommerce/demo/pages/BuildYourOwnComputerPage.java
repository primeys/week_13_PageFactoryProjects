package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Util {

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement _textBuildYourOwnCom;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement _buildYourOwnComputerLink;

    @FindBy(xpath = "//label[contains(text(),'320 GB')]")
            WebElement _hdd_320GB;

    @FindBy(id = "add-to-cart-button-1")
    WebElement _addToCartBtn;

    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement _itemAddedToCartText;

    public void buildYourOwnComputerLink(){
        clickOnElement( _buildYourOwnComputerLink);
    }
    public String confirmTextBuildYourOwnCom(){
        return getTextFromElement(_textBuildYourOwnCom);
    }
    public void clickOnHdd320GB(){
        clickOnElement(_hdd_320GB);
    }
    public void clickOnAddToCart(){ clickOnElement(_addToCartBtn);}
    public String itemAddedToCartText(){
        return getTextFromElement(_itemAddedToCartText);
    }

}
