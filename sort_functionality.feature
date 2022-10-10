Feature: User can Sort the popular movies


  Scenario: Verify the Sort list is present
    Given I am on the Popular page of MovieApp
    When  I click on "Popular" tab
    Then I verify that "Sort" label is present
    Then I click on Sort verify that Sort is single select list
    Then I verify that Sort has three items "Title","Release Date" and "Popularity Score"
