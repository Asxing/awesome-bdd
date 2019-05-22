package com.holddie.cucumber.spring.config;

import com.holddie.cucumber.spring.CucumberSpringApplication;
import com.holddie.cucumber.spring.controller.TestController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CucumberSpringApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringApplicationDemoThreeTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test() throws Exception {
        assertNotNull(restTemplate);
        String body = this.restTemplate.getForObject("/h", String.class);
        System.out.println("body = " + body);
        log.info("body = " + body);
    }
}
