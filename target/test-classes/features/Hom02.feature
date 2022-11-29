Feature: Class Calismasi
  
  Scenario Outline: 
    
    When  kullanici "dataUrl" adresine gider
    Then new butonuna tiklar
    And isim bolumune firsname girer
    And soyisim bolumune lastname girer
    And  position bolumune position girer
    And ofis bolumune ofisbilgisi girer
    And extension bolumune extension girer
    And startdate boumune Stardate girer
    And salary boumune Salary girer
    And  create tusuna basarr
    Then kullanici 3 saniye bekler
    When kullanici fistname ile arama yapar
    Then kullanici 3 saniye bekler
    Then isim bolumunde firsname oldugunu dogrular
    Then kullanici 3 saniye bekler
    Then kullanici firsname oldugunu dogrular
    Then kullanici 3 saniye bekler
