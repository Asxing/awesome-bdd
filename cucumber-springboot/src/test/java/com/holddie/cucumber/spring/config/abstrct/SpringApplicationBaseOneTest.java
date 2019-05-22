package com.holddie.cucumber.spring.config.abstrct;

import com.holddie.cucumber.spring.CucumberSpringApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@Slf4j
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CucumberSpringApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class SpringApplicationBaseOneTest {

    @LocalServerPort
    public Integer port;

    public TestRestTemplate testRestTemplate;

    public String SERVER_URL = "http://localhost";

    public String getEndpoint() {
        return SERVER_URL + ":" + port;
    }

    public SpringApplicationBaseOneTest() {
        testRestTemplate = new TestRestTemplate();
    }

    @Autowired
    public TestRestTemplate restTemplate;

//    @Test
//    public void test() {
//        log.info("# port:" + port.toString());
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/h",
//                String.class)).contains("hello1");
//    }
}
