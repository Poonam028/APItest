package RestAssuredBasics;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_GET_TestNG {
    @Test

            public void test_GET_Request(){
        RestAssured
                .given()
                .baseUri("https://www.zippopotam.us/")
                .basePath("/us/90210")
                .when()
                .get().then()
                .statusCode(200);
    }

}
