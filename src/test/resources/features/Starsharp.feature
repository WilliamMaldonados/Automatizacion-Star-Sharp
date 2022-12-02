# Autor: William Maldonado

@stories
  Feature: As a user, I want login in the Star Sharp Page so i should create a new meetings
    Background:
      Given that the user is on the star sharp page
      And the user Logs in
      |user | password  |
      | admin | serenity|

      @scenario1

      Scenario Outline: Create a new  Bussines unit
        And he goto the Bu