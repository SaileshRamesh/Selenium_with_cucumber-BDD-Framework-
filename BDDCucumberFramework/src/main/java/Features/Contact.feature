Feature: Add contact
      
Scenario Outline: Add new contact Scenario
      Given User is on Application Home Page
      When Application title is freecrm
      Then User enters "<username>" and "<password>"
      And user clicks on Login Button
      When user navigate to user Profile Page 
      Then Go to contacts
      Then Open Contact Form 
      Then User enters Contacts "<firstname>" and "<lastname>" and "<companyName>"
      Then save the contact
      Then close the browser
      
Examples: 
      | username | password | firstname | lastname | companyName |
      | heerasailesh@gmail.com | Avatar@2000 | Sailesh | Ramesh | Cognizant Technology Solutions |
      | heerasailesh@gmail.com | Avatar@2000 | Heera | Saravanan |Accenture Pvt Lmtd |
      | heerasailesh@gmail.com |Avatar@2000 | Ramesh |Vasu |Amazon|
     