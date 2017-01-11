$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/features/FirstTouchLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login to first touch",
  "description": "",
  "id": "login-to-first-touch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "verify login succesfull",
  "description": "",
  "id": "login-to-first-touch;verify-login-succesfull",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens firsttouch login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters loginid",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on signIn",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify login succesfull",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "FirstTouchLogin.user_opens_firsttouch_login_page()"
});
formatter.result({
  "duration": 9576378306,
  "status": "passed"
});
formatter.match({
  "location": "FirstTouchLogin.user_enters_loginid()"
});
formatter.result({
  "duration": 407001985,
  "status": "passed"
});
formatter.match({
  "location": "FirstTouchLogin.user_enters_password()"
});
formatter.result({
  "duration": 225513702,
  "status": "passed"
});
formatter.match({
  "location": "FirstTouchLogin.user_clicks_on_signIn()"
});
formatter.result({
  "duration": 89190789,
  "status": "passed"
});
formatter.match({
  "location": "FirstTouchLogin.verify_login_succesfull()"
});
formatter.result({
  "duration": 1355823,
  "status": "passed"
});
formatter.match({
  "location": "FirstTouchLogin.close_browser()"
});
formatter.result({
  "duration": 1131851854,
  "status": "passed"
});
});