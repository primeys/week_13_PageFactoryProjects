package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {

    HomePage homePage;
    ComputersPage computersPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnPage;

@BeforeMethod
    public void setUpTest(){
    homePage = new HomePage();
    computersPage = new ComputersPage();
    desktopsPage =new DesktopsPage();
    buildYourOwnPage = new BuildYourOwnComputerPage();

}
    @Test(groups = "sanity")
    public void userShouldNavigateToBuildYourOwnPageSuccessfully() {
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.scrollUpDown(600);
        desktopsPage.clickOnAddToCartBtn();
        String actualText = buildYourOwnPage.confirmTextBuildYourOwnCom();
        String expectedText = "Build your own computer";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test (groups = "regression")
    public void desktopShouldAddToBasketSuccessfully() throws InterruptedException {

        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.buildYourOwnLink();
        desktopsPage.scrollUpDown(600);
        buildYourOwnPage.scrollUpDown(500);
        Thread.sleep(3000);
        buildYourOwnPage.clickOnHdd320GB();
        buildYourOwnPage.scrollUpDown(300);
        buildYourOwnPage.clickOnAddToCart();
        String addedToCartExpectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnPage.itemAddedToCartText(),addedToCartExpectedText);
        Thread.sleep(1000);
    }
}