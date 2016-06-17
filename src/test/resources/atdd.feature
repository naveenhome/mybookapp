Feature: Calculator

  Scenario Outline: ATDD
    Given user enter <expr>
    Then resulr should be <result>

    Examples: 
      | expr        | result |
      | "1 2 3 + -" | "-4"   |
