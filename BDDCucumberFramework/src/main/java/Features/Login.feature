Feature: Login Appplication feature

#Scenario: User Login Scenario
#     Given User is on Application Home Page
#     When Application title is Reddit
#     Then User enters "saiesh_ramesh@rediffmail.com" and "Avatar@2000"
#     And user clicks on Login Button
#     When user navigate to user Profile Page 
     

Scenario Outline: User Login Scenario
      Given User is on Application Home Page
      When Application title is freecrm
      Then User enters "<username>" and "<password>"
      And user clicks on Login Button
      When user navigate to user Profile Page 
      #Then close the browser
      
Examples:
      |username | password|
      |heerasailesh@gmail.com | Avatar@2000|
     
   
