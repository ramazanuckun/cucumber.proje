Feature: Parametre Kullanimi
  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonURL" sayfasina gider
    When url'nin "amazon" icerdigini test eder
    And sayfayi kapatir


  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "facebookURL" sayfasina gider
    When url'nin "facebook" icerdigini test eder
    And sayfayi kapatir

  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "bestbuyURL" sayfasina gider
    When url'nin "bestbuy" icerdigini test eder
    And sayfayi kapatir


  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "hepsiburadaURL" sayfasina gider
    When url'nin "hepsiburada" icerdigini test eder
    And sayfayi kapatir
