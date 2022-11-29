@US17
  Feature: US17 Admin olarak ,yeni test ogeleri olusturabilir
Background: Ortka adimlar
  Given Ramazan "https://medunna.com/"'ee gider

      @US17_TC01
      Scenario: TC01 Admin yeni test ogeleri olusturabilir



        When Ramazan User sign in butonuna tiklar
        And Ramazan ilk sign in yazisina tiklar
        And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
        And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
        And Ramazan sign in butonuna tiklayip oturum acar
        And Ramazan items&titles ikonuna tiklar
        And Ramazan test&items secer
        And Ramazan create a new test item yazisi uzerine gelir ve tiklar
        And Ramazan Create or edit a Test Item sayfasinin acildigini dogrular

    Scenario: TC_02 Kullanici kayit formunu doldurur

      When Ramazan User sign in butonuna tiklar
      And Ramazan ilk sign in yazisina tiklar
      And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
      And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
      And Ramazan sign in butonuna tiklayip oturum acar
      And Ramazan items&titles ikonuna tiklar
      And Ramazan test&items secer
      And Ramazan create a new test item yazisi uzerine gelir ve tiklar
      And Ramazan name,description,price,Default min value,default max value girer
      And Ramazan cread data olusturur ve gunceller

    Scenario: TC_03 kullanici test ogelerini goruntuleyebilir
      When Ramazan User sign in butonuna tiklar
      And Ramazan ilk sign in yazisina tiklar
      And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
      And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
      And Ramazan sign in butonuna tiklayip oturum acar
      And Ramazan items&titles ikonuna tiklar
      And Ramazan test&items secer
      And Ramazan test&ogelerini goruntuleyebilir

    Scenario: TC_04 kullanici test ogelerini silebilir
      When Ramazan User sign in butonuna tiklar
      And Ramazan ilk sign in yazisina tiklar
      And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
      And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
      And Ramazan sign in butonuna tiklayip oturum acar
      And Ramazan items&titles ikonuna tiklar
      And Ramazan test&items secer
      And Ramazan delete ikonuna tiklayarak bir test ogelerini siler