Feature: Login Feature Functionality
 Hi here we are testing login functionality

 #Added code to publish HTML reports in Jenkins
  #Hi
 Scenario: Login with valid credentials
    Given the browser is launched
    When the testing URL opens and we enter username and password
    Then it should open the home page
    And verifyit