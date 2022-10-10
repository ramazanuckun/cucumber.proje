Feature: US002 Parametre Kullanimi

  @parameter
  Scenario: TC01 Kullanici

    Given kullanici amazon anasayfasina gider
    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder
    And sayfayi kapatir

