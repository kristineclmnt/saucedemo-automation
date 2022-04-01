# Saucedemo Test Automation
A Data Driven and BDD Automation Framework, that tests the UI and basic functionality of the Saucedemo web application.

### Pre-requisites:
* JDK 1.8+
* Maven
* IntelliJ IDEA (Download plugins: Cucumber for Java, Gherkin)

### How to set up the project:
* See Pre-requisites above
* Open the cloned project in IntelliJ
* Right click the project -> Maven -> Reload project

### How to run tests:
Navigate to the Project's file directory and open a command window. Run a command.
* Run all tests:
  **mvn test**

* Run a specific feature:
  **mvn test -Dcucumber.options="--tags @LoginFeature"**

* Run all tests in a different browser:
  **mvn test -Dbrowser=firefox**


### Test Report:
A test overview report will be generated at **target/cucumber-report/feature-overview.html**


###### (Work in progress. Incomplete features and tests.)
