package com.evernote.step_definitions;

import com.evernote.pages.BasePage;
import com.evernote.utilities.BrowserUtils;
import com.evernote.utilities.ConfigurationReader;
import com.evernote.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


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
        BrowserUtils.waitFor(1); //for being seen
    }

    @Then("the user signs out")
    public void the_user_signs_out() {

        Driver.get().switchTo().parentFrame();
        basePage.userID.click();
        basePage.signOut.click();

        String expectedTitle = "Notes - Evernote";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        }


    }




