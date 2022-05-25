package com.automation.testcases.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.base.BaseFixture;
import com.automation.pages.api.APIControlller;

import io.restassured.response.Response;

public class DummyTestCase extends BaseFixture {
	
	
	
	@Test(testName="Dummy API Test for Get Call",description="Dummy API Description for Get Call")
	public void dummyTestCaseForGetCall() throws Exception
	{
		SoftAssert soft= new SoftAssert();
		System.out.println("We ran a Dummy API Test for get method");
		APIControlller aPIController=new APIControlller();
		Response response=aPIController.getBoard();
		response.prettyPrint();
		int status=response.getStatusCode();
		soft.assertEquals(status, 201,"Verify if the Response code is \"200\"");
		//Assert.assertEquals(status, 201,"Verify if the Response code is \"200\"");
		List<String> ids=response.jsonPath().getList("id");
		for(String id : ids)
		{
			System.out.println("Id: " + id);
		} 
		//response.jsonPath().getMap("prefs.permissionLevel");
		
		System.out.println("permissionLevel: "+response.jsonPath().get("prefs.permissionLevel"));
		
		List<Map<String,Object>> prefs=response.jsonPath().getList("prefs");
		
		System.out.println("Printing entry set"+prefs.get(0).entrySet());
		System.out.println("Printing entry set----------");
		
		System.out.println("boolen: "+prefs.get(0).get("hideVotes"));
	
		/**	for (Map.Entry<String, Object> entry :prefs.get(0).entrySet())
        {
			String key = (String)entry.getKey();
            String value = (String)
            		entry.getValue();
           
 
            System.out.println(key + "=" + value);
        }**/
		
		String id=(String)response.jsonPath().getList("id").get(0);
		System.out.println("id converted:"+id);
		System.out.println("-----updating board---------------");
		response=aPIController.updateBoard(id);
		response.prettyPrint();
		soft.assertAll();
	
	}
	
	

}
