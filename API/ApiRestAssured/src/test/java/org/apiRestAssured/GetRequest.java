package org.apiRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		int statusCode = response.statusCode();
		String statusLine = response.statusLine();
		System.out.println(statusCode);
		System.out.println(statusLine);
	}
}
 