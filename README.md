# Hybrid-Test-Framework

This project is a Java-based automation testing framework for the [OpenCart](https://tutorialsninja.com/demo/) e-commerce platform. It utilizes Selenium WebDriver, TestNG, and follows the Page Object Model (POM) design pattern.

## Features

- Cross-browser testing support (Chrome, Firefox, Edge)
- Local and remote execution capabilities
- Data-driven testing using Excel
- Logging with Log4j2
- Reporting with ExtentReports
- Screenshot capture on test failure

## Project Structure

- `src/test/java/testBase`: Contains the BaseClass with common setup and teardown methods
- `src/test/java/pageObjects`: Page Object classes for different pages of the application
- `src/test/java/testCases`: Test case classes
- `src/test/java/utilities`: Utility classes for Excel operations, reporting, and data providers
- `src/test/resources`: Configuration files, test data, and XML suites

## Setup and Execution

1. Clone the repository
2. Install the required dependencies (Maven will handle this)
3. Update the `config.properties` file with your OpenCart URL and credentials
4. Run the tests using Maven or TestNG

### Running tests with Maven

```
mvn clean test
```

### Running tests with TestNG

Run the `testng.xml` file directly from your IDE or using the command line:

```
java -cp <classpath> org.testng.TestNG testng.xml
```

## Test Cases

1. TC001_AccountRegistrationTest: Verifies the account registration process
2. TC002_LoginTest: Verifies the login functionality
3. TC003_LoginDDT: Data-driven test for login with multiple sets of credentials

## Reporting

Test reports can be found in the `test-output` directory after test execution.
