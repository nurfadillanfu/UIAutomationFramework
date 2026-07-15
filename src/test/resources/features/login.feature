Feature: Login Functionality

  Scenario: Login dengan username dan password benar
    Given User membuka halaman login
    When User memasukkan username "standard_user"
    And User memasukkan password "secret_sauce"
    And User menekan tombol login
    Then User berhasil masuk ke dashboard

  Scenario: Login dengan username salah
    Given User membuka halaman login
    When User memasukkan username "wrong_user"
    And User memasukkan password "secret_sauce"
    And User menekan tombol login
    Then Muncul pesan error

  Scenario: Login dengan username kosong
    Given User membuka halaman login
    When User memasukkan username ""
    And User memasukkan password "secret_sauce"
    And User menekan tombol login
    Then Muncul pesan error

  Scenario: Login dengan username sangat panjang
    Given User membuka halaman login
    When User memasukkan username "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
    And User memasukkan password "secret_sauce"
    And User menekan tombol login
    Then Muncul pesan error