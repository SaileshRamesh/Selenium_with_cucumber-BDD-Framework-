Feature: Add new Deal


Scenario: Login with valid credentials
      Given User is on Application Home Page
      When Application title is freecrm
      Then User enters username and password
      | username | password |
      | heerasailesh@gmail.com | Avatar@2000 |
      
      And user clicks on Login Button
      When user navigate to user Profile Page
      
Scenario: Login with invalid credentials
      Given User is on Application Home Page
      When Application title is freecrm
      Then User enters username and password
      | username | password |
      | heerasailesh@gmail.com | Avatar@2000 |
      
      And user clicks on Login Button
      When Application title is freecrm

Scenario: Add new Multi Deal 
      Given User is on Application Home Page
      When Application title is freecrm
      Then User enters username and password
      | username | password |
      | heerasailesh@gmail.com | Avatar@2000 |
      
      And user clicks on Login Button
      When user navigate to user Profile Page 
      Then Go to Deal form
      Then New Deal Contact Form 
      Then User enters deal data
      | Title | Amount | probability | Commission | Description | Next Step |
      | New Deal | 1000 | 20 |3 | This is new Deal | To Be discussed |
      | CX Deal | 1000 | 20 |3 | This is new Deal | To Be discussed |
      | Water Deal | 1000 | 20 |3 | This is new Deal | To Be discussed |
      | Earphones Deal | 1000 | 20 |3 | This is new Deal | To Be discussed |
      | BN Deal | 1000 | 20 |3 | This is new Deal | To Be discussed |
  
      Then save the Deal
      #Then close the browser
      