package com_quickfit.pages;


import com_quickfit.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotBookingPage extends Utility {

    @FindBy(xpath = "/html/body/article/div/div/div[2]/div/p[1]")
    WebElement _bookYourMot;

    public String bookingDetailsText() {

        return getTextFromElement(_bookYourMot);

    }


}
