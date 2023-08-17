@AllScenariosRegisterNewUser
Feature: Create User in UTest

  As a new user
  I want to join
  in the application

  Background:
    Given a new user is going to join

  @RegisterNewUserSuccessfully
  Scenario: Register new user successfully

    When  complete the four steps whit his information
    Then he should see in the screen a welcome message

  @RegisterNewUserFirstStepFailed
  Scenario: Register new user failed

    When  doesn't complete the first steps whit his information
    Then  he should see in the screen a error message

  @RegisterNewUserExistingEmail
  Scenario: Register new user existing email

    When  complete the first steps whit a existing "test@gmail.com" email
    Then  he should see in the screen a existing email message



