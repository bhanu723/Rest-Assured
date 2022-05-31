package com.testcases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.pojoclasses.Employees;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostCreateEmpPojo {
	
	Faker faker = new Faker();
	Employees emp;  
	
	@BeforeTest
	public void setUp() {
		RestAssured.baseURI="http://localhost:3000";
		emp = new Employees(faker.number().numberBetween(100, 999),faker.name().firstName(), 
				faker.job().position(), 
				new String[] {faker.book().title(),faker.book().title()}, 
				faker.company().name(), 
				faker.internet().emailAddress());
	}
	
	
	@Test
	public void postCreateUser() {
		
		Response response = given().log().all()
			.auth().none().contentType(ContentType.JSON).body(emp).
		when()
			.post("/employees").
		then()
			.log().all().extract().response();
		
		Assert.assertEquals(response.statusCode(), 201);
		
//		Employees empResp = ObjectMapper.
		
	}
	

}
