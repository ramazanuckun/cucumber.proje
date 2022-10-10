Feature: US004 Class Work
  Scenario: TC01 Kullanici gecerli bilgilerle giris yapar
    Given kullanici "rentacarURL" anasayfasina gider
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login yazisina tiklar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir
