Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Calculating results
    Given I want to add a <competitor>
    When I check the <result> in step
    Then I verify the <score> in step

    Examples: 
      | competitor | result | score   |
      | name1      | time   | success |
