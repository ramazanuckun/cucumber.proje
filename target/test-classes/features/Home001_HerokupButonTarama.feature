@rru

Feature:  US1011ClassWork


Scenario: Herocap sitesi buton tarama


    Given   User goes to direct "https://the-internet.herokuapp.com/add_remove_elements/"
    When Add Element butona basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    Then Delete butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silinn
    Then AddRemove Elements yazisinin gorunurlugunu test eder
    And kullanici 3 sn bekler
    And Delete butonunun gorunmedigini test edinn
    And kullanici 3 sn bekler
    And User close browser
