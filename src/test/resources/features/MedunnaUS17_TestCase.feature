@!7
Feature: US_17 TestCaseleri

  Scenario: US_17 TC01
    Given kullanici "https://medunna.com/" sayfasina giderrr
    When login olmak icin signin e tiklarr
    And username icin "Team15@gmail.com" kullanici adini gonderirr
    And password icin "Batch[81]&T15" parolasini gonderirr
    And signine tiklarr
    And Kullanici Items&Titles ikonunu tiklar
    And kullanici test-items bolumune tiklar
    And Kullanici create a test yazisina tiklayarak yeni birtest ogesi olustrma bolumune yonlendirilir
    And kullanici Create or edit a Test Item yazisini gorur
    And kullanici name girer,


