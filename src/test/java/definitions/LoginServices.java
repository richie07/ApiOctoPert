package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import supports.RequestLogin;

public class LoginServices {
    RequestLogin login;

    public LoginServices() {
        login = new RequestLogin();
    }

    @Given("post login en el service {string} , {string}")
    public void postLoginEnElService(String email, String password) {
        login.postLogin(email,password);
    }

    @When("user calls http request")
    public void userCallsHttpRequest() {
    }

    @Then("the API call got success with status code {int}")
    public void theAPICallGotSuccessWithStatusCode(int codigo) {
        login.validateStatusCode(codigo);
    }

    @And("response body as {string}")
    public void responseBodyAs(String token) {
        login.validateTokenBody(token);
    }

    @And("response body {string} as {string}")
    public void responseBodyAs(String element, String elementRequest) {
        login.validateUnSuccessfullBody(element,elementRequest);
    }
}
