Feature: Instagram functionality testing

  @smoke
  Scenario: verifying instagram  login functioanlityone
    Given user should be in the instagram login pageone
    When user should enter the username and passwordone
    And user should click the login buttonone
    Then user should pass the final messageone

  @sanity
  Scenario: verifying instagram  login functioanlitytwo
    Given user should be in the instagram login pagetwo
    When user should enter the username and passwordtwo
    And user should click the login buttontwo
    Then user should pass the final messagetwo

  @sanity
  Scenario: verifying instagram  login functioanlitythree
    Given user should be in the instagram login pagethree
    When user should enter the username and passwordthree
    And user should click the login buttonthree
    Then user should pass the final messagethree

  @reg
  Scenario: verifying instagram  login functioanlityFour
    Given user should be in the instagram login pageFour
    When user should enter the username and passwordFour
    And user should click the login buttonFour
    Then user should pass the final messageFour
