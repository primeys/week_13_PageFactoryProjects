package com_Quickfit.testsuite;

import com_Quickfit.testbase.BaseTest;
import com_Quickfit.loadproperty.LoadProp;
import com_Quickfit.pages.HomePage;
import com_Quickfit.pages.MotBookingPage;
import com_Quickfit.pages.MotPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    LoadProp loadProp = new LoadProp();
    HomePage homePage = new HomePage();
    MotPage motPage = new MotPage();
    MotBookingPage motBookingPage = new MotBookingPage();


    @Test
    public void verifyUserIsAbleBookMotTest() {
        homePage.clickOnMotpage();
        //Assert.assertEquals(motPage.getMotPageTitle(), "Book Your MOT Test Online", "User is not on MOT page");
        motPage.inputCarRegNumber();
        motPage.clickOnSearchButton();
        Assert.assertTrue(motBookingPage.bookingDetailsText().contains(loadProp.getProperty("Reg")));

    }









}
