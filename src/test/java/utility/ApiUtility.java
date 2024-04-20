package utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class ApiUtility {

    public static void apiGetMethod(String apiUsername, String apiPassword, String apiUrl, String endPoint, int responseCode){

        Response response = RestAssured.given().auth().basic(apiUsername,apiPassword)
                .when().get(apiUrl + "/" + endPoint).then().extract().response();
        System.out.println(response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(),responseCode);

    }

}
