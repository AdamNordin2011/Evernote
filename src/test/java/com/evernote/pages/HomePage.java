package com.evernote.pages;

import com.evernote.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//nav[@class='utility-nav']//a[contains(text(),'Log In')]")
    public WebElement loginButton;

}
