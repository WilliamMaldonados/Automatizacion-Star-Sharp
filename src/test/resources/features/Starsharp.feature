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
        And he go to the Bussines Units
        When he create a new unit
        |unitName|
        |<unitName>|
        Then the <unitName> should display in the menu
        Examples:

        |unitName|
        |UnidadWill1|

        @scenario2
        Scenario Outline: Create a meeting succesfully
          And he go to meetings menu
          When he create a meeting
          | meetName | meetNumber | meetDateStart | meetDateEnd | unitName |
          |<meetName>|<meetNumber>|<meetDateStart>|<meetDateEnd>|<unitName>|
          Then the <meetName> should display in the table
          Examples:
          | meetName      | meetNumber | meetDateStart | meetDateEnd |  unitName |
          | PruebaChoucair|     1205   |    13/02/2022 | 13/02/2022  | UnidadWIll|


