$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/smartbear.feature");
formatter.feature({
  "name": "SmartBear Functions Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate adding new order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@R"
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
  "name": "user clicks on \"Order\" menu item",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnMenuItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"FamilyAlbum\" as product",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userSelectsAsProduct(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters 2 as quantity",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersAsQuantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all address information",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersAllAddressInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all payment information",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersAllPaymentInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Process\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"View all orders\" menu item",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnMenuItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see their order displayed in the \"List of All Orders\" table",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldSeeTheirOrderDisplayedInTheTable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate all information entered displayed correct with the order",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.validateAllInformationEnteredDisplayedCorrectWithTheOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});