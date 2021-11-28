Feature: Testing the Hudl login page

  Scenario: Test back icon from login page
    Given user navigates to the login page "https://www.hudl.com/login/"
    When user clicks the back icon
    Then the user is redirected to "https://www.hudl.com/en_gb/"

  Scenario: Test logo icon from login page
    Given user navigates to the login page "https://www.hudl.com/login/"
    When user clicks the logo icon
    Then the user is redirected to "https://www.hudl.com/en_gb/"

  Scenario: Test login with empty fields
    Given user navigates to the login page "https://www.hudl.com/login/"
    When user clicks the login button
    Then the user is shown login error message

  Scenario: Test login with empty email field
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user enters the email "" and password "invalid"
    When user clicks the login button
    Then the user is shown login error message

  Scenario: Test login with empty password field
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user enters the email "mushedmiah@hotmail.com" and password ""
    When user clicks the login button
    Then the user is shown login error message

    # <insert valid password>
  Scenario: Test login with invalid email and valid password
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user enters the email "fake@hotmail.com" and password "<insert valid password>"
    When user clicks the login button
    Then the user is shown login error message

  Scenario: Test login with valid email and invalid password
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user enters the email "mushedmiah@hotmail.com" and password "invalid"
    When user clicks the login button
    Then the user is shown login error message

    # <insert valid password>
  Scenario: Test login with valid email and password
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user enters the email "mushedmiah@hotmail.com" and password "<insert valid password>"
    When user clicks the login button
    Then the user is redirected to "https://www.hudl.com/home"

    # <insert valid password>
  Scenario: Test login with remember me
    Given user navigates to the login page "https://www.hudl.com/login/"
    And selects the remember me option
    And the user enters the email "mushedmiah@hotmail.com" and password "<insert valid password>"
    When user clicks the login button
    Then the user is redirected to "https://www.hudl.com/home"
    When the user clicks log out
    Then the user is redirected to "https://www.hudl.com/en_gb/"
    When the user clicks login from homepage
    And the user enters the password "<insert valid password>"
    When user clicks the login button
    Then the user is redirected to "https://www.hudl.com/home"

  Scenario: Test forgotten password link
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user clicks forgotten password link
    When the user enters the forgotten email "mushedmiah@hotmail.com"
    And the user clicks send password reset button
    Then the check youre email message is displayed
    # manually then check you're email to ensure you have received the email and complete the reset password flow

  Scenario: Test forgotten password link within error message (with email already pre-filled)
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user enters the email "mushedmiah@hotmail.com" and password ""
    When user clicks the login button
    Then the user is shown login error message
    When the user clicks forgotten password link inside error message
    And the user clicks send password reset button
    Then the check youre email message is displayed
    # manually then check you're email to ensure you have received the email and complete the reset password flow

  Scenario: Test signup link in
    Given user navigates to the login page "https://www.hudl.com/login/"
    And the user clicks the signup link
    Then the user is redirected to "https://www.hudl.com/register/signup"


  # check clicking sing in via organization takes us to https://www.hudl.com/app/auth/login/organization
#  Test the 'Log In With An Organization' link -> if clicked -> should redirect the user to https://www.hudl.com/app/auth/login/organization
#    - Sign in using a valid email and assert that the user has access to data/videos that it should have access to and nothing else
#    - Test that invalid user is not able to login
#    - Test the different components of the organization login page