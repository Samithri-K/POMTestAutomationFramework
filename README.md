# Sellenium_automation_framework
📌 Overview

This repository contains a scalable Selenium test automation framework designed using Java, Selenium WebDriver, TestNG, and Maven.
The framework follows the Page Object Model (POM) design pattern to ensure maintainability, reusability, and clean separation of concerns between test logic and UI elements.

It is suitable for both real-world enterprise projects and learning purposes.

🚀Key Features

Page Object Model (POM) based architecture

Clear separation of:

Test logic

Page classes

Test data

Configuration

Supports cross-browser execution

Configurable test execution via TestNG XML

Maven-based dependency management

CI/CD friendly (Jenkins / GitHub Actions ready)

Easily extendable for new test scenarios

🛠 Tech Stack

Language: Java

Automation Tool: Selenium WebDriver

Test Framework: TestNG

Build Tool: Maven

Design Pattern: Page Object Model (POM)

📂 Framework Structure
selenium-automation-framework/
│
├── src/main/java
│   ├── pages/          # Page Object classes
│   ├── utils/          # Utility classes (config, waits, helpers)
│
├── src/test/java
│   ├── tests/          # Test classes
│
├── src/test/resources
│   ├── testdata/       # Test data files
│   ├── config/         # Environment and browser configurations
│   └── testng.xml      # TestNG execution file
│
├── pom.xml             # Maven dependencies
└── README.md

🔐 Sample Test Scenarios

Basic regression test flows

(Scenarios can be easily extended to cover end-to-end workflows.)

▶️ How to Run Tests
1️⃣ Clone the repository
git clone https://github.com/<your-username>/selenium-automation-framework.git
cd selenium-automation-framework

2️⃣ Run tests using Maven
mvn clean test

3️⃣ Run tests using TestNG XML
mvn test -DsuiteXmlFile=testng.xml

🔄 CI/CD Integration

The framework is designed to integrate easily with CI/CD tools such as:

Jenkins

GitHub Actions

Azure DevOps

Execution can be triggered via Maven commands as part of pipeline jobs.

🧱 Design Principles

Maintainability: Changes in UI affect only page classes

Reusability: Common actions and utilities are shared

Scalability: Easy to add new tests and pages

Readability: Clean, well-structured code



Interview and portfolio showcase
