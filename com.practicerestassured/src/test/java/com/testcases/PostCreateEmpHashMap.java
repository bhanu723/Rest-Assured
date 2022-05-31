package com.testcases;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostCreateEmpHashMap {

	Map<String, Object> mapEmp;
	Faker faker = new Faker();
	
	@BeforeMethod
	public void setUp() {
		
		mapEmp = new HashMap<String, Object>();
		String[] skills = {"MSOffice","UNIX"};
		
		mapEmp.put("id", faker.number().numberBetween(100, 999));
		mapEmp.put("firstName","Sue");
		mapEmp.put("job", "Teacher");
		mapEmp.put("skills",skills );
	
		Map<String,String> mapCompany = new HashMap<String,String>();
		mapCompany.put("companyName", "JNTU");
		mapCompany.put("email", "abc@gmail.com");
		
		mapEmp.put("companyDetails", mapCompany);
		
		
		RestAssured.baseURI="http://localhost:3000";
	}
	
	@Test
	public void postCreateEmpMap() {
		
		Response response = given().log().all()
				.auth().none().contentType(ContentType.JSON).body(mapEmp).
			when()
				.post("/employees").
			then()
				.log().all().extract().response();
			
			Assert.assertEquals(response.statusCode(), 201);
			
			
	}
	
	
}
