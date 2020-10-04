package supports;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ApiHelper {
    public Response postLoginOctoPert(String email,String password,String url){
        Response response = given()
                .param("username",email)
                .param("password",password)
                .when()
                .post(url);

        return response;
    }
}
