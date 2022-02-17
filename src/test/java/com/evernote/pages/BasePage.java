package com.evernote.pages;

import com.evernote.utilities.Driver;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "qa-CREATE_NOTE")
    public WebElement NewButton;

    @FindBy(xpath = "//span[normalize-space()='Note']")
    public WebElement NoteButton;

    @FindBy(xpath = "//textarea[@placeholder='Title']")
    public WebElement title;

    @FindBy(xpath = "//*[@id=\"en-note\"]/div")
    public WebElement note;

    @FindBy(xpath = "//*[@id=\"qa-NAV_USER\"]/div/div/span/div/div[1]/div")
    public WebElement userID;

    @FindBy(id = "qa-ACCOUNT_DROPDOWN_LOGOUT")
    public WebElement signOut;

    @FindBy(id = "58b9e9a1-ef7c-6017-4eab-344d0874daa0")
    public WebElement createdNote;

    @FindBy(xpath = "//*[@id=\"qa-NAV_HOME\"]/span")
    public WebElement homeButton;

    @FindBy(xpath = "//span[normalize-space()='AdamsNotesTitle']")
    public WebElement adamsNoteTitle;

}
