@statuscodes
Feature: HTTP status codes
  Scenario Outline: Check the status HTTP status codes
    Given A User Navigates to StatusCodes Page
    When A User Clicks on status Code <input>
    Then Application displays the message <outputCode>
    Examples:
      | input | outputCode |
      | 200   | 200        |
      | 301   | 301        |
      | 404   | 404        |