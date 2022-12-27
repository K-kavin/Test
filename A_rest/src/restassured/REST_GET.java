package restassured;

import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class REST_GET 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.GET,"/api/users/2");
		String value = res.prettyPrint();
		System.out.println(value);
		int code = res.statusCode();
		System.out.println(code);
		System.out.println(res.getTime());
		
		
		
		
		
	}
}
