Feature: Login to app
  In this filed we test user login to app.
  This section is only description, not change test.

  Scenario: User provides correct data
    # given is precondition to make a test pass
    Given User is on login page
    # and specifies additional precondition
    And User about user name "userName1" and password "password" is in database
    # when specifies the action that has been performed
    When User provides user name "userName1" and password "password"
    # and specifies the additional actions and condition
    And User clicks login sign in
    # then specifies result previous steps
    Then User is logged to main page application
    # and specifies additional result
    And Message about correct login is displayed

  Scenario: User provides incorrect data
    Given User is on login page
    And User about user name "userName2" and password "badPassword" is in database
    When User provides user name "userName2" and password "badPassword"
    # but makes it possible adding negative comment, using to negative condition
    But Login data are incorrect
    And User clicks login sign in
    Then User isn't logged to main page application
    And Message about incorrect login attempt is displayed