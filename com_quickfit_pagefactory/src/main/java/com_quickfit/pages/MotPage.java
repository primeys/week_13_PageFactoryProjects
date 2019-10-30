package com_quickfit.pages;

import com_quickfit.Utility.Utility;
import com_quickfit.loadproperty.LoadProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotPage extends Utility {

    @FindBy(xpath = "//input[@id='VRN']")
    WebElement _carRegBox;

    @FindBy(xpath = "//*[@id=\"frmSMOT\"]/div/div[2]/button")
    WebElement _searchButton;


    public void inputCarRegNumber(String carRegNo) {
        clickOnElement(_carRegBox);
        sendTextToElement (_carRegBox,carRegNo);
    }

    public void clickOnSearchButton() {
        clickOnElement(_searchButton);
    }
}
