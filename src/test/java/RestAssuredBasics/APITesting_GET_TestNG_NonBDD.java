package RestAssuredBasics;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
public class APITesting_GET_TestNG_NonBDD {

    @Description("TC1- NonBDDStyle positive test case")
    @Test

            public void test_GET_Request(){
        RequestSpecification r = RestAssured.given();
        r.given().baseUri("https://www.zippopotam.us/")
                .basePath("/us/90210");
                r.when().log().all().get();
                r.then().log().all().statusCode(200);
    }

    @Description("TC2- NonBDDStyle negative test case")
    @Test

    public void test_GET_RequestNTC(){
        RequestSpecification r = RestAssured.given();
        r.given().baseUri("https://www.zippopotam.us/")
                .basePath("/us/50210");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }


}
