package com.evernote.pages;

import com.evernote.utilities.BrowserUtils;
import com.evernote.utilities.ConfigurationReader;
import com.evernote.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;


    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement continueButton;

    @FindBy(id = "responseMessage")
    public WebElement responseMessage;

    public void login(String userNameStr) {
        username.sendKeys(userNameStr);
        continueButton.click();

    }


}
