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
plugins {
    id 'java'
}

group = 'org.dipra11'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation group: 'org.testng', name: 'testng', version: '7.10.2'
    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.5.0'
    testImplementation group: 'org.json', name: 'json', version: '20220924'
    testImplementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.5.0'
}

test {
    useTestNG()
    }

## Screenshoot
<img width="892" alt="image" src="https://github.com/user-attachments/assets/c38fb865-f00d-4cee-9518-88508c3dc335">
