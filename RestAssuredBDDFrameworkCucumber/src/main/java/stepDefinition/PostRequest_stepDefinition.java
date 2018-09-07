package stepDefinition;

import org.junit.runner.Request;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest_stepDefinition {
	public Response response;
	public ValidatableResponse json;
	public Request request;
    
    public String EndPoint="https://reqres.in";
	
    public RequestSpecification requestspec=RestAssured.given().baseUri(EndPoint);
    
	@Given("^post url for send request$")
	public void post_url_for_send_request() {
	    
	    
	    JsonObject requestparams=new JsonObject();
	    requestparams.addProperty("name", "morpheus");
	    requestparams.addProperty("job", "leader");
	    
	    requestspec.header("Content-Type", "application/json");
	    requestspec.body(requestparams.toString());
	    
	}

	@When("^user post request$")
	public void user_post_request(){
		
		response=requestspec.post("/api/users");
	    System.out.println(response.prettyPrint());
	}

	@Then("^post request status code is (\\d+)$")
	public void post_request_status_code_is(int statusCode){
	    json=response.then().statusCode(statusCode);
	}
	
	@And("^post response body contains$")
	public void post_response_body_contains(Map<String,String> responseFields) {
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue())){
				json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
			}
			else{
				json.body(field.getKey(), equalTo(field.getValue()));
			}
		}
	}
	
	@And("^post response headers contains$")
	public void post_response_headers_contains(Map<String,String> responseFields) {
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue())){
				json.header(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
			}
			else{
				json.header(field.getKey(), equalTo(field.getValue()));
			}
		}
	}

}
