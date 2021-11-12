package com.udemy;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LoginSteps {

    private Login login;
    private String username;
    private String password;

    @Given("^User is on login page$")
    public void userIsOnLoginPage() {
        login = new Login();
    }

    @And("^User clicks login sign in$")
    public void userClicksLoginSignIn() {
        System.out.println("We click button login.");
    }

    @Then("^User is logged to main page application$")
    public void userIsLoggedToMainPageApplication() {
        Assert.assertTrue(login.isLoggedIn());
    }

    @And("^Message about correct login is displayed$")
    public void messageAboutCorrectLoginIsDisplayed() {
        Assert.assertTrue(login.getMsg().equals("You have successfully logged in"));
    }

    @But("^Login data are incorrect$")
    public void loginDataAreIncorrect() {
        String databaseUsername = login.getCurrentUsername();
        String databasePassword = login.getCurrentPassword();
        Assert.assertFalse(username.equals(databaseUsername) && password.equals(databasePassword));
    }

    @Then("^User isn't logged to main page application$")
    public void userIsnTLoggedToMainPageApplication() {
        Assert.assertTrue(login.isLoggedIn());
    }

    @And("^Message about incorrect login attempt is displayed$")
    public void messageAboutIncorrectLoginAttemptIsDisplayed() {
        Assert.assertTrue(login.getMsg().equals("You can't logged in to app"));
    }

    @When("^User provides user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userProvidesUserNameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
        login.logIn(username, password);
    }

    @And("^User about user name \"([^\"]*)\" and password \"([^\"]*)\" is in database$")
    public void userAboutUserNameAndPasswordIsInDatabase(String username, String password) {
        login.setUserInDataBase(username, password);
    }
}
