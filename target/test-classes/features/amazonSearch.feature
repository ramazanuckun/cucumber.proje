Feature: Amazon Search

  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 kullanici amazonda Selenium aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder
    And sayfayi kapatir