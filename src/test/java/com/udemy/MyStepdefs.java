package com.udemy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    @Given("^Account with balance 200zl$")
    public void account_with_balance_200zl() {
        System.out.println("Method Given");
    }

    @When("^User try cash withdrawal 300zl$")
    public void user_try_cash_withdrawal_300zl() {
        System.out.println("Method When");
    }

    @Then("^Balance is not change and equals 300zl$")
    public void balance_is_not_change_and_equals_300zl() {
        System.out.println("Method Then");
    }

    @Given("^User is on login page$")
    public void userIsOnLoginPage() {
    }
}
