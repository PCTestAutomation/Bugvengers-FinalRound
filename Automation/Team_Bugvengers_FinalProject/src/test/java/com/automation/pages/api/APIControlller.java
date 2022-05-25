package com.automation.pages.api;

import java.util.HashMap;

import com.automation.base.BaseFixture;
import com.automation.util.ExtentReportManager;
import com.aventstack.extentreports.Status;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class APIControlller extends BaseFixture {
	
	public static Response serverResponse;
	public static JsonPath jsonPathEvaluator;
	
	public Response getBoard() throws Exception
	{
		ExtentReportManager.getTest().log(Status.INFO, "Getting Boards");
		serverResponse= BaseFixture.restClient.get("/1/members/me/boards");
		return serverResponse;
	}
	
	public Response updateBoard(String id) throws Exception
	{
		ExtentReportManager.getTest().log(Status.INFO, "Updating Board Name");
		HashMap<String,String> params=new HashMap<String,String>();
		params.put("desc", "Created a new Board");
		serverResponse= BaseFixture.restClient.putWithPathParamAndQueryParam(" /1/boards/{id}", "id", id,params);
		return serverResponse;
	}
	
	

}
