
• I built a Cucumber BDD (with JUnit 4 Assertions) test framework using Java Programming Language.

• I built my framework with Maven as a build management tool.

• Dependencies were installed into the pom.xml file

• Inside the Cucumber runner package, I used glues to connect feature files to step definitions in CukesRunner class.In runner package I also created a failedTestRunner class to execute just failed tests.

• I added the report plugin to Cucumber Runner to generate a Json and HTML report.

• I have an utilities package, which contains utility classes such as BrowserUtils and Configuration Reader.

• I am using Page Object Modelling to enhance test maintenance and reduce code duplication.

• I am using Cucumber and Gherkin language to make more understandable what is going on in testing.

• I used a Cucumber Scenario outline, and an example feature.

• I have created my test cases in the feature files as-is.

• In the Feature folder, I store my feature files separately, and it helps in the usability of the codes.

TEST RUN

Clone the project Import maven dependencies from POM Go src -> test > java > runners > CukesRunner and RUN To run just register scenario use @register tag in the CukesRunner class/Cucumber Options.