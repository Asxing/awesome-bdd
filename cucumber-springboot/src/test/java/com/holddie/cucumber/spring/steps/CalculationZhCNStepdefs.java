package com.holddie.cucumber.spring.steps;


import com.holddie.cucumber.spring.config.SpringApplicationBaseTest;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;
import org.junit.Ignore;
import org.springframework.http.ResponseEntity;

/**
 * @author HoldDie
 * @date 2019-05-22 16:45
 * @vsersion 1.0
 **/
@Ignore
public class CalculationZhCNStepdefs extends SpringApplicationBaseTest {
    private ResponseEntity<String> responseEntity;

    private String getCompleteEndPoint(String uri) {
        return getEndpoint() + uri;
    }

    @假如("^两数相加$")
    public void 两数相加() {
    }

    @当("^参数一\"([^\"]*)\"加参数二\"([^\"]*)\"$")
    public void 参数一加参数二(Integer arg0, Integer arg1) {
        String URI = "/calc/add/" + arg0 + "/" + arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
    }

    @那么("^两数相加输出的结果是\"([^\"]*)\"$")
    public void 两数相加输出的结果是(String arg0) {
        Assert.assertEquals(arg0, responseEntity.getBody());
    }


    @假如("^两数相减$")
    public void 两数相减() {
    }

    @当("^参数一\"([^\"]*)\"减参数二\"([^\"]*)\"$")
    public void 参数一减参数二(Integer arg0, Integer arg1) {
        String URI = "/calc/sub/" + arg0 + "/" + arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
    }

    @那么("^两数相减输出的结果是\"([^\"]*)\"$")
    public void 两数相减输出的结果是(String arg0) {
        Assert.assertEquals(arg0, responseEntity.getBody());
    }


    @假如("^两数相乘$")
    public void 两数相乘() {
    }

    @当("^参数一\"([^\"]*)\"乘参数二\"([^\"]*)\"$")
    public void 参数一乘参数二(Integer arg0, Integer arg1) {
        String URI = "/calc/multiply/" + arg0 + "/" + arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
    }

    @那么("^两数相乘输出的结果是\"([^\"]*)\"$")
    public void 两数相乘输出的结果是(String arg0) {
        Assert.assertEquals(arg0, responseEntity.getBody());
    }


    @假如("^两数相除$")
    public void 两数相除() {
    }

    @当("^参数一\"([^\"]*)\"除参数二\"([^\"]*)\"$")
    public void 参数一除参数二(Integer arg0, Integer arg1) {
        String URI = "/calc/divide/" + arg0 + "/" + arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
    }

    @那么("^两数相除输出的结果是\"([^\"]*)\"$")
    public void 两数相除输出的结果是(String arg0) {
        Assert.assertEquals(arg0, responseEntity.getBody());
    }
}
