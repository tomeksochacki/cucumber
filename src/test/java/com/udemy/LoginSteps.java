package com.udemy;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class LoginSteps {
    @Given("^User is on login page$")
    public void userIsOnLoginPage() {
    }

    @And("^User clicks login sign in$")
    public void userClicksLoginSignIn() {
    }

    @Then("^User is logged to main page application$")
    public void userIsLoggedToMainPageApplication() {
        
    }

    @And("^Message about correct login is displayed$")
    public void messageAboutCorrectLoginIsDisplayed() {
    }


    @But("^Login data are incorrect$")
    public void loginDataAreIncorrect() {
    }


    @Then("^User isn't logged to main page application$")
    public void userIsnTLoggedToMainPageApplication() {
        
    }

    @And("^Message about incorrect login attempt is displayed$")
    public void messageAboutIncorrectLoginAttemptIsDisplayed() {

    }

    @When("^User provides user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userProvidesUserNameAndPassword(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^User about user name \"([^\"]*)\" and password \"([^\"]*)\" is in database$")
    public void userAboutUserNameAndPasswordIsInDatabase(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
