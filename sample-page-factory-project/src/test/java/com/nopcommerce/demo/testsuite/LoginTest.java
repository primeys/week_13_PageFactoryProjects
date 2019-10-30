package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    LoadProperty loadProperty = new LoadProperty();

    @BeforeMethod
    public void setUpTest() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test (groups = "sanity")
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }
    @Test(groups = "regression")
    public void userShouldLoginSuccessfully() throws InterruptedException {
        homePage.clickOnLoginLink();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        Thread.sleep(2000);
        loginPage.clickOnLoginBtn();
    }
}
