package RestAssuredBasics;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_GET_Req {
    @Test
    public void test_GET_Request(){

        String pin_code = "388620";
        RestAssured
                .given()
                .baseUri("https://www.zippopotam.us/")
                .basePath("/us/" + pin_code)
                .when().log().all()
                .get().then().log().all()
                .statusCode(200);
    }

}
