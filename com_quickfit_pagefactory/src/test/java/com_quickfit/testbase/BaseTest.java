package com_quickfit.testbase;

import com_quickfit.basepage.BasePage;
import com_quickfit.browserselector.BrowserSelector;
import com_quickfit.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);}

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
