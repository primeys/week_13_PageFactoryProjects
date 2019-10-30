package com_Quickfit.testbase;

import com_Quickfit.basepage.BasePage;
import com_Quickfit.browserselector.BrowserSelector;
import com_Quickfit.loadproperty.LoadProp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    //before method for each test case, it will run before each method from Testsuite class.
    //this method will open the browser, max, delete, and open the url
    @BeforeMethod
    public void openBrowser()
    {
        browserSelector.selectBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //close browser after each method in testsuite class
    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }



}
