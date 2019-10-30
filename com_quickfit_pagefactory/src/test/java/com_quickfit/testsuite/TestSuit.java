package com_quickfit.testsuite;

import com_quickfit.loadproperty.LoadProperty;
import com_quickfit.pages.HomePage;
import com_quickfit.pages.MotBookingPage;
import com_quickfit.pages.MotPage;
import com_quickfit.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    LoadProperty loadProp = new LoadProperty();
    MotPage motPage = new MotPage();
    MotBookingPage motBookingPage = new MotBookingPage();


    @Test (groups = "sanity")
    public void verifyUserIsAbleBookMotTest() {
        homePage.clickOnMotpage();
        //Assert.assertEquals(motPage.getMotPageTitle(), "Book Your MOT Test Online", "User is not on MOT page");
        motPage.inputCarRegNumber(loadProp.getProperty("Reg"));
        motPage.clickOnSearchButton();
        Assert.assertTrue(motBookingPage.bookingDetailsText().contains(loadProp.getProperty("Reg")));

    }

}
