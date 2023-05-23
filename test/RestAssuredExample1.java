package test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

public class RestAssuredExample1 {

	public static void main(String[] args) {

		// GET method
		Response getResponse = RestAssured.get("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(getResponse.getBody().asString());

		// Retrieve data using GET request
		Response getResponse = RestAssured.get("https://jsonplaceholder.typicode.com/todos/1");
		int userId = getResponse.jsonPath().getInt("userId");
		String title = getResponse.jsonPath().getString("title");


		// Set authentication token
		String authToken = "myAuthToken";

		// Set headers for POST request
		String contentType = ContentType.JSON.toString();
		String authorizationHeader = "Bearer " + authToken;

		// Pass data to downstream POST request
		Response postResponse = RestAssured.given()
				.contentType(contentType)
				.header("Authorization", authorizationHeader)
				.body(requestBody.toString())
				.post("https://jsonplaceholder.typicode.com/todos");

		// Print response
		System.out.println(postResponse.getBody().asString());


		// POST method
		JSONObject requestBodyPost = new JSONObject();
		requestBodyPost.put("title", "test");
		requestBodyPost.put("completed", false);

		Response responsePost = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBodyPost.toString())
				.post("https://jsonplaceholder.typicode.com/todos");
		System.out.println(responsePost.getBody().asString());

		// PUT method
		JSONObject requestBodyPut = new JSONObject();
		requestBodyPut.put("id", 1);
		requestBodyPut.put("title", "delectus aut autem");
		requestBodyPut.put("completed", false);

		Response responsePut = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBodyPut.toString())
				.put("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(responsePut.getBody().asString());

		// DELETE method
		Response responseDelete = RestAssured.delete("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(responseDelete.getStatusCode());

		// HEAD method
		Response responseHead = RestAssured.head("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(responseHead.getStatusCode());

		// PATCH method
		JSONObject requestBodyPatch = new JSONObject();
		requestBodyPatch.put("title", "delectus aut autem - Updated");

		Response responsePatch = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBodyPatch.toString())
				.patch("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(responsePatch.getBody().asString());

		// OPTION method
		Response responseOption = RestAssured.options("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(responseOption.getStatusCode());


		//Pass QUERYParameter
		given()
		.queryParam("paramName", "paramValue")
		.when()
		.get("/api/endpoint")
		.then()
		.statusCode(200);


		//Pass PATH Parameter
		given()
		.pathParam("paramName", "paramValue")
		.when()
		.get("/api/{paramName}/endpoint")
		.then()
		.statusCode(200);

		//How to validate response body using JSONPath?
		given()
		.when()
		.get("/api/endpoint")
		.then()
		.body("name", equalTo("John"))
		.body("age", equalTo(30));

		//How to validate response headers?
		given()
		.when()
		.get("/api/endpoint")
		.then()
		.header("headerName", "headerValue")
		.statusCode(200);


		//How to send a POST request with request body?

		given()
		.body("{\"key1\":\"value1\",\"key2\":\"value2\"}")
		.when()
		.post("/api/endpoint")
		.then()
		.statusCode(200);

		//How to authenticate using Bearer Token?
		given()
		.auth()
		.oauth2("bearer token")
		.when()
		.get("/api/endpoint")
		.then()
		.statusCode(200);

		//How to authenticate using Basic Authentication?
		given()
		.auth()
		.preemptive()
		.basic("username", "password")
		.when()
		.get("/api/endpoint")
		.then()
		.statusCode(200);


		//How to handle timeouts in RestAssured?
		given()
		.config(RestAssured.config().redirect(redirectConfig().followRedirects(false))
				.when()
				.get("/api/endpoint")
				.then()
				.statusCode(200);

		//How to handle redirects in RestAssured?
		given()
		.allowRedirects(false)
		.when()
		.get("/api/endpoint")
		.then()
		.statusCode(301)
		.header("Location", "newUrl");


		//How to handle cookies in RestAssured?
		given()
		.cookie("cookieName", "cookieValue")
		.when()
		.get("/api/endpoint")
		.then()
		.statusCode(200);

		/*
		 * How do you authenticate with RestAssured?
		RestAssured provides several methods for authentication, including basic, digest, form, OAuth, and certificate-based authentication. 
		The most common method is basic authentication, which is done by passing a username and password with the auth().basic() method. For example:

		 */
		given()
		.auth().basic("username", "password")
		.when()
		.get("/api/endpoint")
		.then()
		.statusCode(200);

		/*
		How can you perform file uploads with RestAssured?
		RestAssured provides a multiPart() method that can be used to upload files. For example: 

		 */
		given()
		.multiPart(new File("/path/to/file"))
		.when()
		.post("/api/endpoint")
		.then()
		.statusCode(200);

		/*
		How do you handle JSON and XML payloads with RestAssured?
		RestAssured can handle JSON and XML payloads natively. 
		To send a JSON payload, you can use the body() method with a string or a Map or a POJO object. For examp
		 */
		given()
		.contentType("application/json")
		.body("{\"name\": \"John\", \"age\": 30}")
		.when()
		.post("/api/endpoint")
		.then()
		.statusCode(200);

		given()
		.contentType("application/xml")
		.body("<person><name>John</name><age>30</age></person>")
		.when()
		.post("/api/endpoint")
		.then()
		.statusCode(200);



	}
}
