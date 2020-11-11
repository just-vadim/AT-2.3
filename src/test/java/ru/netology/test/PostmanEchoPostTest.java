package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoPostTest {
    @Test
    public void shouldPost(){
        given()
                .baseUri("https://postman-echo.com")
                .body("test body")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("body"))
        ;
    }
}