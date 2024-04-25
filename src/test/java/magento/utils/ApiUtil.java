package magento.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtil {

    public static void apiGetMethod(String apiUsername, String apiPassword, String apiUrl, String endPoint, int responseCode){

        Response response = RestAssured.given().auth().basic(apiUsername,apiPassword)
                .when().get(apiUrl + "/" + endPoint).then().extract().response();
        System.out.println(response.prettyPrint());

    }

}
