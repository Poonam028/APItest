package SampleCheck;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest006NonBDDStyle {

    @Test
            public void TestNonBDDStyle(){
        RequestSpecification r= RestAssured.given();
        r.given();
        r.baseUri("https://www.zippopotam.us/");
        r.basePath("/us/90210");
        r.when().get();
        r.then().statusCode(200);

    }

}
