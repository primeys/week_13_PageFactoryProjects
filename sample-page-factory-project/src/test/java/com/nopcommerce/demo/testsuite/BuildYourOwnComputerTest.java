package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildYourOwnComputerTest extends BaseTest {

    @Test (groups = "regression")
    public void userShouldNavigateToBuildYourOwnPageSuccessfully(){
        HomePage homePage = new HomePage();
        BuildYourOwnComputerPage buildYourOwnPage = new BuildYourOwnComputerPage();
        ComputersPage computersPage = new ComputersPage();
        DesktopsPage desktopsPage = new DesktopsPage();

        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.scrollUpDown(600);
        desktopsPage.clickOnDesktopLink();
        String actualText = buildYourOwnPage.confirmTextBuildYourOwnCom();
        String expectedText = "Build your own computer";
        Assert.assertEquals(actualText,expectedText);
    }
}
