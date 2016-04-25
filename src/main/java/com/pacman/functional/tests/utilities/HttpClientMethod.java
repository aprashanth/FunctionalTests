package com.pacman.functional.tests.utilities;

import java.io.IOException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpClientMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HttpClient httpClient = new HttpClient();
		
		HttpMethod getMethod = new GetMethod("http://www.yahoo.com");
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, 
	    		new DefaultHttpMethodRetryHandler(3, false));
		
		try {
		      // Execute the method.
		      int statusCode = httpClient.executeMethod(getMethod);

		      if (statusCode != HttpStatus.SC_OK) {
		        System.err.println("Method failed: " + getMethod.getStatusLine());
		      }

		      // Read the response body.
		      byte[] responseBody = getMethod.getResponseBody();

		      // Deal with the response.
		      // Use caution: ensure correct character encoding and is not binary data
		      System.out.println(new String(responseBody));

		    } catch (HttpException e) {
		      System.err.println("Fatal protocol violation: " + e.getMessage());
		      e.printStackTrace();
		    } catch (IOException e) {
		      System.err.println("Fatal transport error: " + e.getMessage());
		      e.printStackTrace();
		    } finally {
		      // Release the connection.
		    	getMethod.releaseConnection();
		    }  
		  }
		

	}


