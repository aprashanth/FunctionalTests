package com.pacman.functional.tests.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class THDHttpClient {
	
	private static final String USER_AGENT = "Mozilla/5.0";
	 
    private static final String GET_URL = "";
 
    private static final String POST_URL = "/PacManWS/rs/request/createNew";
	
//	Create instance of CloseableHttpClient using helper class HttpClients.
	CloseableHttpClient client = HttpClients.createDefault();
	
	
//	Create HttpGet or HttpPost instance based on the HTTP request type.
//	Use addHeader method to add required headers such as User-Agent, Accept-Encoding etc.
//	For POST, create list of NameValuePair and add all the form parameters. Then set it to the HttpPost entity.
//	Get CloseableHttpResponse by executing the HttpGet or HttpPost request.
//	Get required details such as status code, error information, response html etc from the response.
//	Finally close the HttpClient resource.
	
	private static void sendGET() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(GET_URL);
        httpGet.addHeader("User-Agent", USER_AGENT);
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
 
        System.out.println("GET Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));
 
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();
 
        // print result
        System.out.println(response.toString());
        httpClient.close();
    }
 
    private static void sendPOST() throws IOException {
 
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(POST_URL);
        httpPost.addHeader("User-Agent", USER_AGENT);
 
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("versionNumber", "1"));
        urlParameters.add(new BasicNameValuePair("langCode", "en_US"));
        urlParameters.add(new BasicNameValuePair("userId", "paxv8340"));
        
        HttpEntity postParams = new UrlEncodedFormEntity(urlParameters);
        httpPost.setEntity(postParams);
 
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
 
        System.out.println("POST Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));
 
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();
 
        // print result
        System.out.println(response.toString());
        httpClient.close();
 
    }
 

}
