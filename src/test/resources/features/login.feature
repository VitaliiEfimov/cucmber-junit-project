@Regression @login @db
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user us expected to be on login page
    Given user is on the library login page
#    Then user should see dashboard not available to @BeforeMethod

  @smoke @librarian @employee @login
  Scenario: Login as a librarian
#    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  @student @db @login @smoke
  Scenario: Login as a Student
#    Given user is on the library login page
    When user enters student username
    And  user enters student password
    Then user should see dashboard

  @admin @employee @login @smoke
  Scenario: Login as a admin
#    Given user is on the library login page
    When user enters admin username
    And  user enters admin password
    Then user should see dashboard

