package stepDefinitions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.Iterator;
import io.restassured.response.Response;
import utils.Utilities;

public class PetStoreStepDefinitions {

	Response response;
	JSONParser jsonParser = new JSONParser();
	JSONArray petList;
	String BASE_URL;

	@Given("^I set the base url for pet store$")
	public void i_set_the_base_url_for_pet_store() {
		BASE_URL = Utilities.getConfigValue("BASE_URL");
		System.out.println("BASE url is set to "+ BASE_URL);
	}
	
	@When("^I GET all the available pets$")
	public void i_GET_all_the_available_pets() throws ParseException {
		
		// Fetch the GET endpoint from config.properties file
		String endpoint = Utilities.getConfigValue("GET_ENDPOINT");
		RestAssured.baseURI = BASE_URL;
		response = given().contentType(ContentType.JSON).when().get(endpoint);
		System.out.println("\n\nGET Request for available pets is sent");

		// Read JSON response
		Object obj = jsonParser.parse(response.asString());

		// Storing the response in JSON Array
		petList = (JSONArray) obj;
		Iterator<JSONObject> iterator = petList.iterator();

		// Printing the complete List of available pets
		System.out.println("The complete list of Available pets is ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@When("^I POST a new available pets in the store$")
	public void i_POST_a_new_available_pets_in_the_store() {
		
		// Fetch the POST endpoint from config.properties file
		String endpoint = Utilities.getConfigValue("POST_ENDPOINT");
		RestAssured.baseURI = BASE_URL;

		// pass the first available pet into the request body
		response = given().contentType(ContentType.JSON).body(petList.get(0)).when().post(endpoint);
		System.out.println("\n\nPOST Request for new available pet is sent for the pet\n" + petList.get(0));

	}

	@Given("^I PUT the pet status to sold$")
	public void i_PUT_the_pet_status_to_sold() {
		
		// Fetch the PUT endpoint from config.properties file
		String endpoint = Utilities.getConfigValue("PUT_ENDPOINT");
		RestAssured.baseURI = BASE_URL;

		// Updating the status of the available pet to sold
		response = given().contentType(ContentType.JSON).body(petList.get(0)).when().put(endpoint
				);
		System.out.println("\n\nPUT Request to update the status to sold is sent for the pet\n" + petList.get(0));

	}

	@Then("^I validate the status code of API is (\\d+)$")
	public void i_validate_the_status_code_of_API_is(int arg1) {
		
		// Asserting that the response code is 200 OK
		Assert.assertEquals(200, response.getStatusCode());
		System.out.println("The status code is 200");
	}
}
