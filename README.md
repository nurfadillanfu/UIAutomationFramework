# UI Automation Test Framework

## Deskripsi

Project ini merupakan framework pengujian otomatis (UI Automation Testing) menggunakan:

- Java
- Gradle
- Selenium WebDriver
- Cucumber
- JUnit 5

Framework ini menerapkan konsep Page Object Model (POM) sehingga kode lebih terstruktur, mudah dipelihara, dan mudah dikembangkan.

---

## Struktur Project

```
src
│
├── main
│   └── java
│       └── com.nurfadilla.pages
│            └── LoginPage.java
│
└── test
    ├── java
    │   ├── runners
    │   └── stepdefinitions
    │
    └── resources
        ├── features
        └── junit-platform.properties
```

---

## Teknologi

- Java
- Gradle
- Selenium
- Cucumber
- JUnit 5

---

## Test Scenario

### Positive Test

- Login menggunakan username dan password yang benar.

### Negative Test

- Login menggunakan username yang salah.

### Boundary Test

- Login dengan username kosong.
- Login dengan username sangat panjang.

---

## Cara Menjalankan

1. Clone repository

2. Jalankan

```
gradlew clean test
```

3. Report akan tersimpan pada

```
build/reports/cucumber/report.html
```

---

## Website yang Diuji

https://www.saucedemo.com/
