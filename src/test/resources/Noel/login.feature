Feature: Instagram functionality testing
  
  Scenario Outline: verifying instagram  login functioanlity
    Given user should be in the instagram login page
    When user should enter the "<username>" and "<password>"
    And user should click the login button
    Then user should pass the final message
    
    Examples: 
      | username | password  |
      | Noel     | Noel@123  |
      | Kalai    | Kalai@123 |
