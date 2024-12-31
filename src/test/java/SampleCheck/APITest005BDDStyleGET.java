package SampleCheck;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest005BDDStyleGET {
    @Test
    public void Test_Get_Request_Positive(){
        given()
                .baseUri("https://www.zippopotam.us/")
                .basePath("/us/90210")
                .when()
                .get().then()
                .statusCode(200);

    }
}
