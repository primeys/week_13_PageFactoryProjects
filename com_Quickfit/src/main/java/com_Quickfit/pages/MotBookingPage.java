package com_Quickfit.pages;

import com_Quickfit.utility.Utils;
import org.openqa.selenium.By;

public class MotBookingPage extends Utils
{

    private  By _bookYourMot = By.xpath("/html/body/article/div/div/div[2]/div/p[1]");

public String bookingDetailsText ()
    {

        return getText(_bookYourMot);

    }


}
