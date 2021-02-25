Feature: Dummy tag scenario

@SmokeTest @Regression @Sailesh @Ramesh
Scenario: Login Free CRM
       Given user is on Application Homepage
      
@SmokeTest       
Scenario: Login with invalid credentials
       Given user is on Application Homepage
 
@Functional @Regression  
Scenario: Create Deal
       Given user is on Application Homepage

@End2End
Scenario: Create Contact
       Given user is on Application Homepage       

@Task @EndToEnd       
Scenario: Create Task
       Given user is on Application Homepage      
  
@Create @Regression       
Scenario: Create Case
       Given user is on Application Homepage

@Smoke @End2End       
Scenario: Create Email
       Given user is on Application Homepage
      
