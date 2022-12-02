# Autor: William Maldonado

 Feature: Validate the creation of the business unit and new meeting as StarSharp admin



  @Scenario1

  Scenario Outline:Validate the creation of a meeting with a business unit
    Given That I login in the Starsharp page With "admin" and "serenity"
    When I create a Business Unit and a meeting
      | <nameUnit> | <parentUnit> | <meetingName> | <meetingType> | <meetingNumber> | <startDate> | <starTime> | <endDate> | <endTime> | <location> | <unit> | <organizedBy> | <reporter> | <attendeeList> | <attendeeType> | <attenDanceStatus> |
    Then I verify the successful creation of the meeting

    Examples:
      | nameUnit  | parentUnit              | meetingName                  | meetingType | meetingNumber | startDate  | starTime | endDate    | endTime | location | unit      | organizedBy   | reporter     | attendeeList | attendeeType | attenDanceStatus |
      | Choucair1 | Marketing » Editor Team | Contextualizacion de negocio | Strategy    | 10            | 09/20/2022 | 10:00    | 09/20/2022 | 11:00   | On Site  | Marketing | Charles Davis | Alexis Lopez | Dylan Smith  | Guest        | Not Set          |

