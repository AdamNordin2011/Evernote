package com.evernote.pages;

import com.evernote.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "qa-CREATE_NOTE")
    public WebElement NewButton;

    @FindBy(xpath = "//span[normalize-space()='Note']")
    public WebElement NoteButton;

    @FindBy(xpath = "//textarea[@placeholder='Title']")
    public WebElement toDoList;
}
