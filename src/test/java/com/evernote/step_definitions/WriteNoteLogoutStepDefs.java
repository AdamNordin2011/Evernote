package com.evernote.step_definitions;

import com.evernote.pages.BasePage;
import com.evernote.utilities.BrowserUtils;
import com.evernote.utilities.ConfigurationReader;
import com.evernote.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;


public class WriteNoteLogoutStepDefs {

    BasePage basePage = new BasePage();

    @When("the user clicks {string}")
    public void the_user_clicks(String string) {
        basePage.NewButton.click();
        basePage.NoteButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to type some notes")
    public void the_user_should_be_able_to_type_some_notes() {

        Driver.get().switchTo().frame(1);
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        js.executeScript(basePage.toDoList.toString());
      //  basePage.toDoList.click();

        basePage.toDoList.sendKeys(ConfigurationReader.get("note"));
    }

    @Then("the user signs out")
    public void the_user_signs_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
