Feature: Login with Valid Credentials

@sanity
 Scenario:Successful Login with Valid Credentials
  Given User Launch browser
  And opens URL "https://ridisale.com/login/"
  When User navigate to Login page
  And User enters username as "John" and password as "Scott@123"
  And Click on Login button
  Then User navigate to Home page