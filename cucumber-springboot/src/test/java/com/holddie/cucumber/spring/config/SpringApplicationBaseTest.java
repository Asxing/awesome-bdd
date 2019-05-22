package com.holddie.cucumber.spring.config;

import com.holddie.cucumber.spring.CucumberSpringApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CucumberSpringApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class SpringApplicationBaseTest {

    public TestRestTemplate testRestTemplate;

    @LocalServerPort
    public int port;

    public String SERVER_URL = "http://localhost";

    public String getEndpoint() {
        return SERVER_URL + ":" + 58083;
    }

    public SpringApplicationBaseTest() {
        testRestTemplate = new TestRestTemplate();
    }

}
