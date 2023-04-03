//package com.example.demo;
//
//import com.example.demo.Model.User;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.Map;
//
//@ExtendWith(MockitoExtension.class)
//public class SampleTestUsingWebClient {
//    private static final String BODY_VALUE = "bodyValue";
//    private static final ParameterizedTypeReference<Map<String, String>> MAP_RESPONSE_REF = new ParameterizedTypeReference<Map<String, String>>() {
//    };
//    @LocalServerPort
//    private int port;
//    @Test
//    void givenDifferentWebClientCreationMethods_whenUsed_thenObtainExpectedResponse() {
//        WebClient client1 = WebClient.builder().clientConnector(httpConnector()).build();
//        StepVerifier.create(retrieveResponse(client1.post()
//                        .uri("http://localhost:" + port + "/post")))
//                .expectNext("processed-bodyValue")
//                .verifyComplete();
//    }
//
//}