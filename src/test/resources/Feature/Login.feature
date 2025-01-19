Feature: Login Functionality

 Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid "akkh@gmail.com" and "1234" credentials
    And clicks on the login button
    And the user should be redirected to the homepage
    Then a wellcome message should be displayed

    
Scenario: User valid Email and Invalid credentials
Given Navigate to the login page 
When The User enter the Invalid UserName "akkh1@gmail.com" and Password "11234"
And Click on login button 
And User sholud be display homepage
Then A wellcome message should be not displayed

