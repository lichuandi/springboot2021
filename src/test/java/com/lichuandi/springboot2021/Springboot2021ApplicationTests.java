package com.lichuandi.springboot2021;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Springboot2021ApplicationTests {

    @LocalServerPort
    private int port;
    private URL base;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws Exception{
        this.base =new URL("http://localhost:"+port+"/hello");
    }
    @Test
    public void getHello() throws Exception{
        ResponseEntity<String> response=testRestTemplate.getForEntity(base.toString(),String.class);
       // assertThat(response.getBody()),equalTo("Greeting from Spring Boot"));
    }
    @Test
    void contextLoads() {

    }

}
