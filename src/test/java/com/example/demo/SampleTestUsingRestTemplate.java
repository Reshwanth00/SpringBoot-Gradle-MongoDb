package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SampleTestUsingRestTemplate {
    String url = "http://localhost:8888";
    RestTemplate restTemplate = new RestTemplate();
    @Test
    public void itTimeToShine(){
        // https://github.com/eugenp/tutorials/blob/master/spring-web-modules/spring-resttemplate/src/test/java/com/bael
        // dung/resttemplate/RestTemplateBasicLiveTest.java

        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<String> response = testRestTemplate.getForEntity(url+"/get",String.class);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.ACCEPTED);
    }
}
