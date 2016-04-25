$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("first.feature");
formatter.feature({
  "id": "cucumber-test-is-running",
  "tags": [
    {
      "name": "@smokeTest",
      "line": 1
    }
  ],
  "description": "I want to run a sample feature file.",
  "name": "Cucumber test is running",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "cucumber-test-is-running;cucumber-setup",
  "description": "",
  "name": "cucumber setup",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "Sample feature file is ready",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "I run the feature file",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "Run should be successful",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "FirstStepDefinition.Sample_feature_file_is_ready()"
});
formatter.result({
  "duration": 147419307,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.I_run_the_feature_file()"
});
formatter.result({
  "duration": 74207,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.Run_should_be_successful()"
});
formatter.result({
  "duration": 73418,
  "status": "passed"
});
});