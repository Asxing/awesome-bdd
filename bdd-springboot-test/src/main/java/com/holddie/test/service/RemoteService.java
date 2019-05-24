package com.holddie.test.service;

import org.springframework.stereotype.Service;

/**
 * @author HoldDie
 * @date 2019-05-24 07:21
 * @vsersion 1.0
 **/
@Service
public class RemoteService {

    public String someCall() {
        return "mock";
    }
}
