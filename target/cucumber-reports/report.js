$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/smartbear.feature");
formatter.feature({
  "name": "SmartBear Functions Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate \"Web Orders\" menu items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate below menu items are displayed",
  "rows": [
    {
      "cells": [
        "View all orders",
        "View all products",
        "Order"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.validateBelowMenuItemsAreDisplayed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate \"Check All\" and \"Uncheck All\" links",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Check All\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all rows should be checked",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.allRowsShouldBeChecked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Uncheck All\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all rows should be unchecked",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.allRowsShouldBeUnchecked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});