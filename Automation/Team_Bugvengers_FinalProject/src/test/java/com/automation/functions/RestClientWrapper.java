package com.automation.functions;

import java.util.HashMap;

import com.automation.base.BaseAPITest;
import com.automation.base.BaseFixture;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestClientWrapper extends BaseFixture {

	public String resource;
	public String baseUrl;
	public String Userkey;
	public String Usertoken;
	private RequestSpecification request;
	private Response restResponse;

	
	// key and Token passed as query param
	public RestClientWrapper(String baseUrl, RequestSpecification request, String Userkey, String Usertoken) {
		this.request = request;
		this.request.baseUri(baseUrl).relaxedHTTPSValidation("TLS").queryParam("key", Userkey)
				.queryParam("token", Usertoken).log().all();
	}
	
	// for open api
	public RestClientWrapper(String baseUrl, RequestSpecification request) {
		this.request = request;
		this.request.baseUri(baseUrl).relaxedHTTPSValidation("TLS").log().all();
	}
	
	// key and token passed as
	public RestClientWrapper(String baseUrl, RequestSpecification request,String username, String password,boolean flag) {
		if (flag)
		{
			BaseAPITest  baseAPITest=new BaseAPITest();
			baseAPITest.loginAndGetToken(username, password);
			String userToken=baseAPITest.getAccessToken();
			String userKey=baseAPITest.getUserID();
			
		this.request = request;
		this.request.baseUri(baseUrl).relaxedHTTPSValidation("TLS").log().all();
		this.request.baseUri(baseUrl).relaxedHTTPSValidation("TLS").queryParam("key", userKey)
		.queryParam("token", userToken).log().all();
		}
	}
	
	

	public Response get(String resource) throws Exception {

		restResponse = request.get(resource);
		return restResponse;
	}

	public Response post(String resource, String bodyString) throws Exception {

		restResponse = request.when().body(bodyString).post(resource);

		return restResponse;
	}

	public Response put(String resource, String bodyString) throws Exception {

		restResponse = request.when().body(bodyString).put(resource);

		return restResponse;
	}

	public Response postwithQueryparam(String resource, String bodyString, HashMap<String, String> params)
			throws Exception {

		restResponse = request.when().queryParams(params).body(bodyString).post(resource);

		return restResponse;
	}

	public Response postwithQueryparamwithoutBody(String resource, HashMap<String, String> params) throws Exception {

		restResponse = request.when().queryParams(params).post(resource);

		return restResponse;
	}

	public Response postwithQueryparamwithoutBodywithheader(String resource, HashMap<String, String> params)
			throws Exception {

		restResponse = request.header("Content-Type", "application/json").when().queryParams(params).post(resource);

		return restResponse;
	}

	public Response putwithQueryparamwithoutBodywithBoolean(String resource, HashMap<String, Boolean> params)
			throws Exception {

		restResponse = request.when().queryParams(params).put(resource);

		return restResponse;
	}

	public Response putwithQueryparam(String resource, HashMap<String, String> params) throws Exception {

		restResponse = request.when().queryParams(params).put(resource);

		return restResponse;
	}

	public Response putwithQueryparamwithheader(String resource, HashMap<String, String> params) throws Exception {

		restResponse = request.header("Content-Type", "application/json").when().queryParams(params).put(resource);

		return restResponse;
	}

	public Response delete(String resource) throws Exception {

		restResponse = request.delete(resource);

		return restResponse;
	}
	
	public Response putWithPathParamAndQueryParam(String resource, String paramName,String pathParamValue,HashMap<String, String> params) throws Exception {

		restResponse = request.when().pathParam(paramName, pathParamValue).queryParams(params).put(resource);

		return restResponse;
	}

}
