@R
Feature: US_16



@TC_16TestCase
  Scenario: TC01 Kullanici giris yapar ve yeni oda olusturabilir
  Given kullanici "https://medunna.com/" sayfasina giderrr
  When login olmak icin signin e tiklarr
  And username icin "Team15@gmail.com" kullanici adini gonderirr
  And password icin "Batch[81]&T15" parolasini gonderirr
  And signine tiklarr
  And Kullanici Items&Titles ikonunu tiklar
  And Kullanici Room secenegini tiklar
  And Kullanici Create a new  Room yazisini tiklar
  And Kullanici "Create or edit a Room "yazisini gorur


  Scenario Outline: TC02

    Given kullanici "https://medunna.com/" sayfasina giderrr
    When login olmak icin signin e tiklarr
    And username icin "Team15@gmail.com" kullanici adini gonderirr
    And password icin "Batch[81]&T15" parolasini gonderirr
    And signine tiklarr
    And Kullanici Items&Titles ikonunu tiklar
    And Kullanici Room secenegini tiklar
    And Kullanici Create a new  Room yazisini tiklar
    And Kullanici "Create or edit a Room "yazisini gorur
    And kullanici roomNumber dolduru
    And kullanici "<Room type>"secebilir
    And kullanici sayfayi kapatir
    Examples:
      | Room type |
      | TWIN |
      | DELUXE |
      | PREMIUM_DELUXE |
      | SUITE |
      | DAYCARE |


Scenario: TC  03 Oda icin status ayarlanabilir
  Given kullanici "https://medunna.com/" sayfasina giderrr
  When login olmak icin signin e tiklarr
  And username icin "Team15@gmail.com" kullanici adini gonderirr
  And password icin "Batch[81]&T15" parolasini gonderirr
  And signine tiklarr
  And Kullanici Items&Titles ikonunu tiklar
  And Kullanici Room secenegini tiklar
  And Kullanici Create a new  Room yazisini tiklar
  And Kullanici "Create or edit a Room "yazisini gorur
  And kullanici roomNumber doldurmadaz
  And roomNumber bos biralirsa This field is required.yazisin gorur
  And kullanici roomNumber dolduru
  And kullanici room type secebilir
  And kulllanici status secenegini doldurabilir
  And fiyat ekleyebilir ve bos birakamaz
  And  tarih gun,ay ,yil seklinde olmali ve bos birakamaz
  And kullanici sayfayi kapatir


Scenario: TC_04 Fiyat eklenebilir olmali


  Given kullanici "https://medunna.com/" sayfasina giderrr
  When login olmak icin signin e tiklarr
  And username icin "Team15@gmail.com" kullanici adini gonderirr
  And password icin "Batch[81]&T15" parolasini gonderirr
  And signine tiklarr
  And Kullanici Items&Titles ikonunu tiklar
  And Kullanici Room secenegini tiklar
  And Kullanici Create a new  Room yazisini tiklar
  And Kullanici "Create or edit a Room "yazisini gorur
  And kullanici room type secebilir
  And kulllanici status secenegini doldurabilir
  And fiyat ekleyebilir ve bos birakamaz



  Scenario: TC_05 Deciprition istege bagli olmali
    Given kullanici "https://medunna.com/" sayfasina giderrr
    When login olmak icin signin e tiklarr
    And username icin "Team15@gmail.com" kullanici adini gonderirr
    And password icin "Batch[81]&T15" parolasini gonderirr
    And signine tiklarr
    And Kullanici Items&Titles ikonunu tiklar
    And Kullanici Room secenegini tiklar
    And Kullanici Create a new  Room yazisini tiklar
    And Kullanici "Create or edit a Room "yazisini gorur
    And kullanici room type secebilir
    And kulllanici status secenegini doldurabilir
    And fiyat ekleyebilir ve bos birakamaz
  And kullanici sayfayi kapatir



Scenario: TC_06 CRead Date gun/ay/yil seklinde olmali ve gecmis tarih secilememeli
  Given kullanici "https://medunna.com/" sayfasina giderrr
  When login olmak icin signin e tiklarr
  And username icin "Team15@gmail.com" kullanici adini gonderirr
  And password icin "Batch[81]&T15" parolasini gonderirr
  And signine tiklarr
  And Kullanici Items&Titles ikonunu tiklar
  And Kullanici Room secenegini tiklar
  And Kullanici Create a new  Room yazisini tiklar
  And Kullanici "Create or edit a Room "yazisini gorur
  And kullanici room type secebilir
  And kulllanici status secenegini doldurabilir
  And  tarih gun,ay ,yil seklinde olmali ve bos birakamaz



Scenario: TC_06  negatifTest Kullanici geecmis tarihli oda olusturabilir
  Given kullanici "https://medunna.com/" sayfasina giderrr
  When login olmak icin signin e tiklarr
  And username icin "Team15@gmail.com" kullanici adini gonderirr
  And password icin "Batch[81]&T15" parolasini gonderirr
  And signine tiklarr
  And Kullanici Items&Titles ikonunu tiklar
  And Kullanici Room secenegini tiklar
  And Kullanici Create a new  Room yazisini tiklar
  And Kullanici "Create or edit a Room "yazisini gorur
  And  tarih gun,ay ,yil seklinde olmali ve gecmis tarih girer
  And kullanici sayfayi kapatir

  Scenario: TC_7 kullanici ayni tip odalari secebilir
    Given kullanici "https://medunna.com/" sayfasina giderrr
    When login olmak icin signin e tiklarr
    And username icin "Team15@gmail.com" kullanici adini gonderirr
    And password icin "Batch[81]&T15" parolasini gonderirr
    And signine tiklarr
    And Kullanici Items&Titles ikonunu tiklar
    And Kullanici Room secenegini tiklar
    And kullanici ayni tip odalari secebilir

    Scenario: TC_08 kullanici odalari duzenleyebilir ve guncelleyebilir

      Given kullanici "https://medunna.com/" sayfasina giderrr
      When login olmak icin signin e tiklarr
      And username icin "Team15@gmail.com" kullanici adini gonderirr
      And password icin "Batch[81]&T15" parolasini gonderirr
      And signine tiklarr
      And Kullanici Items&Titles ikonunu tiklar
      And Kullanici Room secenegini tiklar
      And kullanici oda duzenler ve gunceller

  Scenario: TC_09 kullanici odalari silebilir

    Given kullanici "https://medunna.com/" sayfasina giderrr
    When login olmak icin signin e tiklarr
    And username icin "Team15@gmail.com" kullanici adini gonderirr
    And password icin "Batch[81]&T15" parolasini gonderirr
    And signine tiklarr
    And Kullanici Items&Titles ikonunu tiklar
    And Kullanici Room secenegini tiklar
    And kullanici delete tusuna basarak oda silebilir
    And kullanici silme icin Delete tusuna onay verir