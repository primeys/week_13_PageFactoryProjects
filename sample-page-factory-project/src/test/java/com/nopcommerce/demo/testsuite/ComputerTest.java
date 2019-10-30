package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    HomePage homePage;
    ComputersPage computersPage;
    DesktopsPage desktopsPage;

    @BeforeMethod
    public void setUpTest(){
        homePage = new HomePage();
        computersPage = new ComputersPage();
        desktopsPage = new DesktopsPage();
    }

    @Test (groups = {"sanity","regression"})
    public void userShouldBeNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        String actualText = desktopsPage.getDesktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText,expectedText);
       }
}
