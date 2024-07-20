# Test Positive and Negative API Automation Framework Java

## Deskrpsi Project
Projek test ini menguji API Framework di Java secara automation, Test ini menguji dengan data yang ada pada website reqres.id.

## Run Project
Pada build.gradle 
* Menyiapkan dependencies
  * TestNG
  * Restassured
  * JSON

* Framework
  * TestNG

* Buat Class (public class testreqres)
   Test yang diuji
    - Tes Positif
      * Get List User pada page 2 dengan status code 200
      * Create User dengan status code 201
      * Delete User dengan satus code 204
    - Tes Negatif
      * Get List user yang tidak terdaftar dengan satus code 404
  
## Library
<img width="599" alt="image" src="https://github.com/user-attachments/assets/ecd42a51-9509-4be1-b8a2-096d3f16141d">


## Screenshoot
<img width="892" alt="image" src="https://github.com/user-attachments/assets/c38fb865-f00d-4cee-9518-88508c3dc335">
