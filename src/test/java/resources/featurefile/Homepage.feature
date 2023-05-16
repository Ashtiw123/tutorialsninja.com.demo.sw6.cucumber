Feature: Homepage test
  As a user i should be able to navigate on home page top menu

  Scenario: User should be able to navigate from homepage to desktop
    Given I am on homepage
    When  I hover mouse over Desktop
    And   I hover mouse over Desktop and click Show AllDesktops
    Then  I should see label "Desktops"

    Scenario: User should be able to navigate from homepage to Laptop and Notebooks
      Given I am on homepage
      When  I hover mouse over Laptops and Notebooks
      And   I hover mouse over Laptops and Notebooks and click on Show AllLaptops & Notebook
      Then  I should see label "Laptops & Notebooks"

  Scenario: User should be able to navigate from homepage to Components
    Given I am on homepage
    When  I hover mouse over Components
    And   I hover mouse over Components and click on Show AllComponents
    Then  I should see label "Components"