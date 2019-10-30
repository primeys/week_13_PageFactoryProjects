package com_quickfit.pages;

import com_quickfit.Utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    private By _motMenu = By.xpath("//*[@id=\"bs-example-navbar-collapse-2\"]/ul[1]/li[5]/a");
    private By _yourReg = By.xpath("//*[@id=\"VRN\"]");

    public void clickOnMotpage(){
        clickOnElement(_motMenu); }

}
