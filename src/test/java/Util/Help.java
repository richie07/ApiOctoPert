package Util;

import io.restassured.response.Response;

public class Help {

    public String getResponseBody(Response response, String elementBody){
        return response.then()
                .extract()
                .path(elementBody);

    }
}
