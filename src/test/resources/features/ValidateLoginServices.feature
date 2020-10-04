@login
Feature: Como usuario deseo validar el servicio Login

  Scenario: Verify Login Succesfully
    Given post login en el service "automation2809@gmail.com" , "Lima2020"
    When user calls http request
    Then the API call got success with status code 200
    And response body as "544c8763-e589-461d-a60c-4fff522f67e6"

  Scenario Outline: Verify Login UnSuccesfully
    Given post login en el service "automation2809@gmail.com" , "Lima0000"
    When user calls http request
    Then the API call got success with status code 404
    And response body "<elementBody>" as "<elementBodyRespuesta>"

    Examples:
    |elementBody|elementBodyRespuesta                  |
    |message    |The requested Item has not been found |
    |type       |ItemNotFoundException                 |