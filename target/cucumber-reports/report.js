$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/smartbear.feature");
formatter.feature({
  "name": "SmartBear Functions Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate invalid login attempt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
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
  "name": "user enters username as \"abcd\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"abcd1234\"",
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
  "name": "user should see \"Invalid Login or Password.\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.user_should_see_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});