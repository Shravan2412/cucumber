Feature: To Test the AddTariff plan
  I want to use this template for my feature file

  Scenario: To verify the Tariff plan
    Given The user is in Add Tariff plan page
    When The user fill the details
     |Mrent|LMin|Imin|smspack|Lpmin|IpMin|Smscharge|
    |10|11|12|13|14|15|16|
    |20|21|22|23|24|25|26|
    |30|31|32|33|34|35|36|
    Then Tariff plan added
