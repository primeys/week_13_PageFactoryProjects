package com_Quickfit.utility;

import com_Quickfit.basepage.BasePage;
import org.openqa.selenium.By;

public class Utils extends BasePage {


     //click method
    public static void clickOnElement(By by) { driver.findElement(by).click();    }

    //type text method
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //get text method
    public static String getText(By by)
    {
        return driver.findElement(by).getText();
    }










}
