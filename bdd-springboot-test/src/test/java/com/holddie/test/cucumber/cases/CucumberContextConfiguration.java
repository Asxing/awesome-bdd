package com.holddie.test.cucumber.cases;

import com.holddie.test.BddSpringbootTestApplication;
import com.holddie.test.service.RemoteService;
import cucumber.api.java.Before;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@Slf4j
@SpringBootTest
@WebAppConfiguration
@ContextConfiguration(classes = BddSpringbootTestApplication.class)
public class CucumberContextConfiguration {


    @Autowired
    private RemoteService remoteService;

    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
        log.info("remoteService:{}", remoteService.someCall());
    }

}
