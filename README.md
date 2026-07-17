# OrangeHRM QA Automation Framework

This project is a Selenium-based QA Automation Framework developed to automate the testing of the OrangeHRM web application. It is built using Java, Selenium WebDriver, TestNG, Cucumber BDD, Maven, and the Page Object Model (POM).

The framework includes data-driven testing using Excel (Apache POI), HTML reporting using Extent Reports and Cucumber Reports, and supports execution using Jenkins and Docker.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Cucumber BDD
- Gherkin
- Maven
- Apache POI
- Page Object Model (POM)
- Extent Reports
- Git & GitHub
- Jenkins
- Docker

## Features

- Page Object Model (POM)
- Data-driven testing using Excel
- Positive and Negative Login Testing
- Logout Automation
- Explicit Waits
- Screenshot capture for failed tests
- TestNG Listeners
- Extent Reports
- Cucumber Reports

## Automated Test Scenarios

- Valid Login
- Invalid Login
- Data-driven Login Testing
- Logout Functionality
- Cucumber Scenario Outline Execution

## Project Structure

src/main/java
- base
- pages
- utilities

src/test/java
- tests
- listeners
- runners
- stepdefinitions

src/test/resources
- features

testdata
- LoginData.xlsx

## How to Run

1. Clone the repository.
2. Open it as a Maven project in Eclipse.
3. Run `testng.xml` or execute:
   `mvn clean test`

## Author

Abhi Sri
