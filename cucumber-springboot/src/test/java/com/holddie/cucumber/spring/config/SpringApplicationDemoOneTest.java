package com.holddie.cucumber.spring.config;

import com.holddie.cucumber.spring.CucumberSpringApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@Slf4j
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestPropertySource(locations="classpath:application.properties")
@SpringBootTest(classes = CucumberSpringApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringApplicationDemoOneTest {

    public TestRestTemplate testRestTemplate;

    public String SERVER_URL = "http://localhost";

    public String getEndpoint() {
        return SERVER_URL + ":" + port;
    }

    public SpringApplicationDemoOneTest() {
        testRestTemplate = new TestRestTemplate();
    }


    @Autowired
    protected MockMvc mvc;

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test() {
        assertNotNull(mvc);
        log.info("# port:" + port.toString());
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/h",
                String.class)).contains("hello1");
    }
}
