@US_17
Feature: : US_17 Test Adimlari
  @TC_01
  Scenario:  TC01 Kullanici giris yapar ve yeni test olusturabilir
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
 # And Description,price,default min value,default max value,cread date degerlerini girer
    And kullanici kaydeder

#@TC2RRu
#Scenario: TC02 kullanici


  #Given kullanici "https://medunna.com/" sayfasina giderrr
 #When login olmak icin signin e tiklarr
 #And username icin "Team15@gmail.com" kullanici adini gonderirr
 #And password icin "Batch[81]&T15" parolasini gonderirr
 #And signine tiklarr
 #And Kullanici Items&Titles ikonunu tiklar
 #And kullanici test-items bolumune tiklar
 #And Kullanici create a test yazisina tiklayarak yeni birtest ogesi olustrma bolumune yonlendirilir
 #And kullanici Create or edit a Test Item yazisini gorur
 #And kullanici name,Description,price,default min value,default max value,cread date degerlerini girer
 #And kullanici kaydeder






#Admin yeni test öğeleri oluşturabilir
#"Admin, ""test items; Name, Description, price Default min value, Default max value ve
#created date (Gün/Ay/Yıl) oluşturabilir ve güncelleyebilir."
#Admin test öğelerini görüntüleyebilir.
#Admin test öğelerini silebilir.-->