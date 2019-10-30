package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends Util {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computerLink;
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _computerVerifyText;

    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement _desktopsImage;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Notebooks')]")
    WebElement _noteBooksImage;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Software')]")
    WebElement _softwareImage;


    public void mouseOverComputer() {
        mouseHoverToElement(_computerLink);
        clickOnElement(_computerLink);
    }

    public String verifyComputerText() {
        return getTextFromElement(_computerVerifyText);
    }

    public void clickOnDesktopImage() {
        clickOnElement(_desktopsImage);
    }

    public void clickOnNoteBooksImage() {
        clickOnElement(_noteBooksImage);
    }

    public void clickOnSoftwareImage() {
        clickOnElement(_softwareImage);
    }


}
