package com.evernote.step_definitions;

import com.evernote.pages.HomePage;
import com.evernote.pages.LoginPage;
import com.evernote.utilities.BrowserUtils;
import com.evernote.utilities.ConfigurationReader;
import com.evernote.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {
HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        homePage.loginButton.click();

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() throws InterruptedException {
        String userName = ConfigurationReader.get("username");
        loginPage.login(userName);
        BrowserUtils.waitFor(3);

        String password = ConfigurationReader.get("password");
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.continueButton.click();

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Evernote Web",actualTitle);

    }


    @When("the user enters wrong username")
    public void the_user_enters_wrong_username() {
        String wrongUserName = ConfigurationReader.get("wrongUserName");
        loginPage.login(wrongUserName);
        BrowserUtils.waitFor(3);
    }

    @Then("the user should NOT be able to login")
    public void the_user_should_NOT_be_able_to_login() {
       String expectedMessage = "There is no account for the username or email you entered.";
       Assert.assertEquals(expectedMessage, loginPage.responseMessage.getText());
    }


}
