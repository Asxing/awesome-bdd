package com.holddie.cucumber.spring.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author HoldDie
 * @date 2019-05-22 16:15
 * @vsersion 1.0
 **/
public class CalculationStepdefs {
    @Given("Create two numbers for addition")
    public void createTwoNumbersForAddition() {
    }

    @And("Add Number{int} {string} and Number{int} {string}")
    public void addNumberAndNumber(int arg0, String arg1, int arg2, String arg3) {
    }

    @Then("The output of addition is {string}")
    public void theOutputOfAdditionIs(String arg0) {
    }

    @Given("Create two numbers for subtraction")
    public void createTwoNumbersForSubtraction() {
        
    }

    @And("Sub NumberA {string} and NumberB {string}")
    public void subNumberAAndNumberB(String arg0, String arg1) {
        
    }

    @Then("The output of subtract is {string}")
    public void theOutputOfSubtractIs(String arg0) {
        
    }

    @Given("Create two numbers for Multiplication")
    public void createTwoNumbersForMultiplication() {
        
    }

    @And("Multi NumberA {string} and NumberB {string}")
    public void multiNumberAAndNumberB(String arg0, String arg1) {
        
    }

    @Then("The output of multiply is {string}")
    public void theOutputOfMultiplyIs(String arg0) {
        
    }

    @Given("Create two numbers for division")
    public void createTwoNumbersForDivision() {
        
    }

    @And("Divide NumberA {string} and NumberB {string}")
    public void divideNumberAAndNumberB(String arg0, String arg1) {
        
    }

    @Then("The output of divison is {string}")
    public void theOutputOfDivisonIs(String arg0) {

    }
}
