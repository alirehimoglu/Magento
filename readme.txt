Automation Framework

Framework Technologies: selenium, cucumber-junit, page object model

Framework consists of 5 packages
 1. modules - page object class methods
 2. runners - cucumber-junit execution configuration
 3. steps - step definitions
 4. utils - varies types of common utilities across all packages
 5. resources - cucumber feature files.

Developing a test
    1. write the BDD scenario in the appropriate feature file
    2. create step definitions for the scenario steps in the steps package
    3. create necessary java/selenium code that defines the step action
    4. if runner class does not exist for the current feature file, create/configure one under runners package
    5. run & debug

Run all tests - mvn test
Run a single test - mvn test -Dcucumber.filter.tags="@Login"
Access test report
    - navigate to target -> cucmber-html-reports
    - then open "overview-features.html" file in the browser

