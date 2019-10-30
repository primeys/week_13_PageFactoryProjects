package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Util {

    @FindBy(id = "gender-male")
            WebElement _genderMaleRadioBtn;
    @FindBy(id = "gender-female")
            WebElement _genderFemaleRadioBtn;
    @FindBy(id = "FirstName")
            WebElement _firstNameField;
    @FindBy(id = "LastName")
            WebElement _lastNameField;
    @FindBy(name = "DateOfBirthDay")
            WebElement _dayOfBirthField;
    @FindBy (name = "DateOfBirthMonth")
            WebElement _monthOfBirthField;
    @FindBy(name = "DateOfBirthYear")
            WebElement _yearOfBirthField;
    @FindBy(id = "Email")
            WebElement _emailField;
    @FindBy(id = "Company")
            WebElement _companyNameField;
    @FindBy (id = "Newsletter")
            WebElement _newsLetterTick;
    @FindBy(id = "Password")
            WebElement _passwordField;
    @FindBy (id = "ConfirmPassword")
            WebElement _confirmPasswordField;
    @FindBy(id = "register-button")
            WebElement _registerBtn;
    @FindBy(xpath = "//strong[contains(text(),'Your Personal Details')]")
            WebElement _registerPageText;

    public void clickOnGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            clickOnElement(_genderMaleRadioBtn);
        } else if (gender.equalsIgnoreCase("female")) {
            clickOnElement(_genderFemaleRadioBtn);
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(_firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(_lastNameField, lastName);
    }

    public void enterDayOfBirth(String birthDay) {
        sendTextToElement(_dayOfBirthField, birthDay);
    }

    public void enterMonthOfBirth(String birthMonth) {
        sendTextToElement(_monthOfBirthField, birthMonth);
    }

    public void enterYearOfBirth(String birthYear) {
        sendTextToElement(_yearOfBirthField, birthYear);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(_emailField, email);
    }

    public void enterCompanyName(String companyName) {
        sendTextToElement(_companyNameField, companyName);
    }

    public void newsLetter() {
        clickOnElement(_newsLetterTick);
    }

    public void enterPassword(String password) {
        sendTextToElement(_passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(_confirmPasswordField, confirmPassword);
    }

    public void clickOnRegistrationBtn() {
        clickOnElement(_registerBtn);
    }

    public String registerText (){
        return getTextFromElement(_registerPageText);}
}
