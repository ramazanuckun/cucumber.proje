Feature: Trendyol Search

  Scenario: US001 kullanici Trendyol sitesinde makas aratir

    Given kullanici google a gider
    Then kullanici google da Trendyol u aratir
    Then kullanici Trendyol a girer
    Then kullanici Trendyol da makas aratir
    And kullanici toplam makas sayisini alir


  Scenario: US002 kullanici Morhipo sitesinde makas aratir

    Given kullanici google a gider
    Then kullanici google da Morhipo u aratir
    Then kullanici Morhipo ya girer
    Then kullanici Morhipo da makas aratir
    And kullanici toplam makas sayisini alir


  Scenario: US003 kullanici makas sayilarini karsilastirir

    Given kullanici makas sayisi fazla olan sayfayi kapatir
    Then kullanici makas sayisi az olan sayfayi kapatir
