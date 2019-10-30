package com_Quickfit.pages;

import com_Quickfit.loadproperty.LoadProp;
import com_Quickfit.utility.Utils;
import org.openqa.selenium.By;

public class MotPage extends Utils {

//    private By _MotPageHeaderText = By.xpath("/html/body/article/div/div/div[2]/div/h12");

    private By _carRegBox = By.xpath("//*[@id=\"VRN\"]");

    private  By _searchButton = By.xpath("//*[@id=\"frmSMOT\"]/div/div[2]/button");

    LoadProp loadProp = new LoadProp();

    public void inputCarRegNumber ()
    {
        clickOnElement(_carRegBox);
        typeText(_carRegBox,loadProp.getProperty("Reg"));
    }

    public void clickOnSearchButton()
    {
        clickOnElement( _searchButton);
    }

}
