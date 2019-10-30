package com_Quickfit.browserselector;

import com_Quickfit.loadproperty.LoadProp;
import com_Quickfit.utility.Utils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
    //object of loadProperty class
    LoadProp loadProp = new LoadProp();

    //method for to open the browser using browser name from config.properties file.

    public void selectBrowser()
    {
        String browser = loadProp.getProperty("browser");

        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else
        {
            System.out.println("wrong browser name");
        }
    }



}
