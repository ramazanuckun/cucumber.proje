@Medunna
Feature: Kulllanici doctor girisi ile giris yapar

Scenario: Kullanici sifre vep asword ile giris yapar

  Given kullanici "https://medunna.com/" sayfasina giderrr
  When login olmak icin signin e tiklarr
  And username icin "Team15@gmail.com" kullanici adini gonderirr
  And password icin "Batch[81]&T15" parolasini gonderirr
  And signine tiklarr
And Kullanici Items&Titles ikonunu tiklar
  And Kullanici Room secenegini tiklar

  And Kullanici "Create or edit a Room "yazisini gorur

