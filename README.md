This framework is a JUnit-Java-Maven Behaviour Driven-Driven framework.

The core programming language is Java.
Maven is used as a build tool due to its efficiency in centralizing and maintaining dependencies, simple folder
structure
and useful pom.xml file.

In this framework next libraries are used:
Selenium WebDriver for our UI scripts to automate web applications,
WebDriverManager for cross-browser testing and
HTMLUnitDriver for headless testing.  
In this framework we implement a Behaviour Driven-Driven framework by using JUnit with its assertions, annotations
and simple report system.

We are following Singleton and Page Object Model design patterns.
Singleton allows us to use the same driver instance in all our framework.
Following the Page Object Model, we create a separate class for every web page using PageFactory class to store
functionality and locators of that web page.
In our framework we implement OOP principles by extending classes, using interfaces and encapsulating some class
members.
We use Cucumber for automation testing of web applications using Feature File, Step Definitions, Pages and the Test
Runner File.
All the features with test steps are written in separate Features files located in Resources;
All the web pages objects with corresponding locators and methods are stored in Pages package;
All the scenarios implementations are stored in Steps package as well as Hooks class which stores reusable after
methods;
Runner Class is the class that is used to link feature files and their step implementation and run scenarios.

We have a Base class which deals with all the common functions used by all the pages. This class is responsible for
loading the configurations from properties files, Initializing the WebDriver, Implicit Waits and Extent Reports.
Also we have a Utility package to store and handle commonly used functions across the entire framework to achieve code
re-usability, reduce maintenance effort and increase readability.
config.properties file stores the information that remains static throughout the framework.

The test data is generated with Faker library.
We use Git as a version control tool and we implement Jenkins for CI/CD and to execute test cases on a daily basis.

I have 2 suites in integrated with Jenkins.
Smoke suite is triggered with a Maven command (mvn test -DCucumber.options="--tags @Smoke")
and Regression suite with (mvn test -DCucumber.options="--tags @Smoke")
This command will first visit the pom.xml goal and then the Runner class and update the given configuration.
With the Tag it gets, it will go to the feature files and execute all the scenarios which have the same Tag.
Scenario steps will be executed with their linked implementation in the “steps” package
Finally, when the execution is complete, the reports specified in the Runner plugin will be generated.
After the execution is complete, surefire reports will be generated under the target folder.

The Smoke suite is triggered to run at 7 am while Regression suite runs at the end of the sprint and after a hotfix.
Test Results are sent to the corresponding team members using Jenkins.
For the reporting purpose, we are using surefire reports.
