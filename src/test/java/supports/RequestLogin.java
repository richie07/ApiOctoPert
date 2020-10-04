package supports;

import Util.Help;
import io.restassured.response.Response;
import org.junit.Assert;

public class RequestLogin extends Help {
    private ApiHelper apiHelper;

    public static Response responseLogin;

    public RequestLogin() {
        apiHelper = new ApiHelper();
    }

    public void postLogin(String email,String password){
        String url = "https://api.octoperf.com/public/users/login";
        responseLogin = apiHelper.postLoginOctoPert(email,password,url);
    }

    public void  validateStatusCode(int codigo){
        Assert.assertEquals(codigo,responseLogin.getStatusCode());
    }

    public void validateTokenBody(String token){
        Assert.assertEquals(token,getResponseBody(responseLogin,"token"));
    }

    public void validateUnSuccessfullBody(String element, String requestElement){
        Assert.assertEquals(requestElement,getResponseBody(responseLogin,element));
    }

}
