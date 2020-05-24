package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CatFactAPI   {

	@Test
	@Description("Get Cat ONE Fact TC")
	

	public void getCatFact() {
		
		
		//Specify base URI

		RestAssured.baseURI  = "https://cat-fact.herokuapp.com/#/cat";

		
		//Request Object (http req)
		RequestSpecification httpreq = RestAssured.given();
			
			//Number of facts to be sent in parameter
			int factsnum = 1 ;

		//Response Object

		Response catResponse = httpreq.request(Method.GET,"/facts/random?{amount}",factsnum);
		String res = catResponse.asString();
		//Print Response in console
		String responseBody = catResponse.getBody().asString();
		System.out.println("Reponse is:" + responseBody );

		//Status Code Validation
		int statusCode = catResponse.getStatusCode();
		System.out.println("Status code is:" + statusCode );
		Assert.assertEquals(statusCode, 200);
		Assert.assertFalse(responseBody.isEmpty());
		//Printing the response
		System.out.println("Response is "+res );
		//Adding the response to Allure report
		Allure.addAttachment("Result:", res);


	}
}
