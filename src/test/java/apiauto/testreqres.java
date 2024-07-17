package apiauto;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class testreqres {

    @Test
    public void testGetListUser() {
        given().when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("per_page", Matchers.equalTo(6))
                .assertThat().body("page", Matchers.equalTo(2));
    }

    @Test
    public void testPostCreateUser() {
        String valueName = "Dicky";
        String valueJob = "Quality Assurance";

        JSONObject bodyObj = new JSONObject();

        bodyObj.put("name", valueName);
        bodyObj.put("job", valueJob);

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(bodyObj.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()
                .assertThat().statusCode(201);
    }

    @Test
    public void testDeleteListUser() {
        RestAssured.baseURI = "https://reqres.in/";
        int userToDelete = 5;

        given().log().all()
                .when().delete("api/users/ " + userToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(204);
    }
    @Test
    public void testGetListUserNotFound() {
        given().when()
                .get("https://reqres.in/api/users/23")
                .then().log().all()
                .assertThat().statusCode(404);

    }
}
