package com.ea.jpamysql;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Test {

	private HttpHeaders getHeaders() {
		String credential = "user:pass";
		String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Basic " + encodedCredential);
		return headers;
	}

	public void Demo1() {
		HttpHeaders headers = getHeaders();

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user";

		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);

		String msg = responseEntity.getBody();

		System.out.println(msg);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.Demo1();
	}
}
