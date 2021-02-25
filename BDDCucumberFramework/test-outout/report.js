$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Add new Deal",
  "description": "",
  "id": "add-new-deal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "add-new-deal;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application title is freecrm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "heerasailesh@gmail.com",
        "Avatar@2000"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user navigate to user Profile Page",
  "keyword": "When "
});
formatter.match({
  "location": "MultiDealsSteps.user_is_on_Application_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.application_title_is_freecrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_navigate_to_user_Profile_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "add-new-deal;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Application title is freecrm",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18
    },
    {
      "cells": [
        "heerasailesh@gmail.com",
        "Avatar@2000"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Application title is freecrm",
  "keyword": "When "
});
formatter.match({
  "location": "MultiDealsSteps.user_is_on_Application_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.application_title_is_freecrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.application_title_is_freecrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 24,
  "name": "Add new Multi Deal",
  "description": "",
  "id": "add-new-deal;add-new-multi-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Application title is freecrm",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28
    },
    {
      "cells": [
        "heerasailesh@gmail.com",
        "Avatar@2000"
      ],
      "line": 29
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user navigate to user Profile Page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Go to Deal form",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "New Deal Contact Form",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User enters deal data",
  "rows": [
    {
      "cells": [
        "Title",
        "Amount",
        "probability",
        "Commission",
        "Description",
        "Next Step"
      ],
      "line": 36
    },
    {
      "cells": [
        "New Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be discussed"
      ],
      "line": 37
    },
    {
      "cells": [
        "CX Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be discussed"
      ],
      "line": 38
    },
    {
      "cells": [
        "Water Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be discussed"
      ],
      "line": 39
    },
    {
      "cells": [
        "Earphones Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be discussed"
      ],
      "line": 40
    },
    {
      "cells": [
        "BN Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be discussed"
      ],
      "line": 41
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "save the Deal",
  "keyword": "Then "
});
formatter.match({
  "location": "MultiDealsSteps.user_is_on_Application_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.application_title_is_freecrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_navigate_to_user_Profile_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.go_to_contacts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.open_Contact_Form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_deal_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MultiDealsSteps.save_the_Deal()"
});
formatter.result({
  "status": "skipped"
});
});