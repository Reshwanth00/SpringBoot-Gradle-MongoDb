package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:8080/";
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl + "/get", String.class);
		assertEquals(response.getStatusCode(), HttpStatus.ACCEPTED);
	}

}
