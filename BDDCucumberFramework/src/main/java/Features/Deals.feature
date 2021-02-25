Feature: Add new Deal

Scenario: Add new Deal Scenario
      Given User is on Application Home Page
      When Application title is freecrm
      Then User enters username and password
      | heerasailesh@gmail.com | Avatar@2000 |
      And user clicks on Login Button
      When user navigate to user Profile Page 
      Then Go to Deal form
      Then New Deal Contact Form 
      Then User enters deal data
      | New Deal | 1000 | 20 |3 | This is new Deal | To Be discussed |
      Then save the Deal
      Then close the browser
      
