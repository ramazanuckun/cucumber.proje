Feature: US013 Class Work

  Scenario: Kullanici ve URL Testi
    Given kullanici "http://webdriveruniversity.com/" anasayfasina gider
    Then kullanici Login Portala kadar asagi tiklar
    And kullanici Login Portala tiklar
    And kullanici diger windowa gecer
    And kullanici "username" kutusuna bilgileri girer
    And kullanici "password" bolumune bilgileri girer
    And kullanici login butonuna basar
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    And kullanici Ok diyerek Popup'i kapatir
    And kullanici ilk sayfaya geri doner
    And kullanici ilk sayfaya donuldugunu test eder