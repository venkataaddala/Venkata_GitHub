package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.runner.Request;

public class NumberofCircuitID_StepDef {
	
	public Response response;
	public ValidatableResponse json;
	public Request request;
	
	public String EndPoint="http://ergast.com/api/f1/2017/Circuits.json";
	
	@Given("^url for get request$")
	public void url_for_get_request() {
	    
	   
	}
	
	@When("^user sends request$")
	public void user_sends_request()
	{
		response=when().get(EndPoint);
		System.out.println("response:"+response.prettyPrint());
		
	}

	@Then("^status code is (\\d+)$")
	public void status_code_is(int statusCode) {
	    json=response.then().statusCode(statusCode);
	}
	
	@And("^size of circuit id is (\\d+)$")
	public void size_of_circuit_id_is(int size) {
	    json=response.then().body("MRData.CircuitTable.Circuits.circuitId", hasSize(size));
	}
	
	@And("^response headers includes the following$")
	public void response_headers_includes_the_following(Map<String,String> responseFields) {
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
