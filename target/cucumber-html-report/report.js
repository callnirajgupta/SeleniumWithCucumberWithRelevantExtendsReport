$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/SnapShot.feature");
formatter.feature({
  "line": 2,
  "name": "Verify that the page screen is matching before deplyoment and after development",
  "description": "",
  "id": "verify-that-the-page-screen-is-matching-before-deplyoment-and-after-development",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SnapShot"
    }
  ]
});
formatter.before({
  "duration": 4268214530,
  "status": "passed"
});
formatter.before({
  "duration": 37734652,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Before deployment take screenshot",
  "description": "",
  "id": "verify-that-the-page-screen-is-matching-before-deplyoment-and-after-development;before-deployment-take-screenshot",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@beforedeployment"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigate to Women page and take screenshot",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user navigate to Tshirts page and take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "SnapShotStepDefinition.user_navigate_to_home_page_and_take_screen()"
});
formatter.write("capturing women page screen shot");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 17699573304,
  "status": "passed"
});
formatter.match({
  "location": "SnapShotStepDefinition.user_navigate_to_best_seller_page_and_take_screen()"
});
formatter.write("capturing Tshirts page screen shot");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 4911788268,
  "status": "passed"
});
formatter.write("I am inside tear down");
formatter.after({
  "duration": 128268645,
  "status": "passed"
});
});