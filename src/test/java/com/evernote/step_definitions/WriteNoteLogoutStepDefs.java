package com.evernote.step_definitions;

import com.evernote.pages.BasePage;
import com.evernote.utilities.BrowserUtils;
import com.evernote.utilities.ConfigurationReader;
import com.evernote.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.sql.SQLOutput;


public class WriteNoteLogoutStepDefs {

    BasePage basePage = new BasePage();

    @When("the user clicks {string}")
    public void the_user_clicks(String string) {
        basePage.NewButton.click();
        basePage.NoteButton.click();
    }

    @Then("the user should be able to type some notes")
    public void the_user_should_be_able_to_type_some_notes() {

        Driver.get().switchTo().frame("qa-COMMON_EDITOR_IFRAME");

        basePage.title.sendKeys(ConfigurationReader.get("title"));
        basePage.note.sendKeys(ConfigurationReader.get("note"));
        BrowserUtils.waitFor(3); //for being seen
        Driver.get().switchTo().parentFrame();
        basePage.homeButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user signs out")
    public void the_user_signs_out() {

        basePage.userID.click();
        basePage.signOut.click();

        String expectedTitle = "Home - Evernote";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        }

    @Then("the user should be able to see the created note")
    public void theUserShouldBeAbleToSeeTheCreatedNote() {
        String expectedNote = ConfigurationReader.get("title");
        String actualNote = basePage.adamsNoteTitle.getText();
        Assert.assertEquals(expectedNote,actualNote);
    }
}




