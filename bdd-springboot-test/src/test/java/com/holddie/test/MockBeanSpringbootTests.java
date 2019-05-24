package com.holddie.test;

import com.holddie.test.service.RemoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

/**
 * @author HoldDie
 * @date 2019-05-24 07:19
 * @vsersion 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MockBeanSpringbootTests {

    @MockBean
    private RemoteService remoteService;

    @Test
    public void exampleTest(){
        when(this.remoteService.someCall()).thenReturn("ss");
    }

}
