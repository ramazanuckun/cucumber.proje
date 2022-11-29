@practiceForm
  Feature: Form doldurma

    Scenario Outline: Practice Form Doldurma

      Given Kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" adresine gider
      When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
      When kullanici 3 saniye bekler
      And bir dosya yukler
      And checkbox1 i secer
      And radio2 yi secer
      And selection item3 secer
      And dropdown itmem4 secer
      And submite tiklar
      When kullanici 3 saniye bekler
When kullanici sayfayi kapatir
   #   Then dosyanin yuklendigini dogru
      Examples:
        | kullanici adi | sifre | metin alani |
        | kullanici adi | sifre | metin alani |
        | kullanici adi | sifre | metin alani |
