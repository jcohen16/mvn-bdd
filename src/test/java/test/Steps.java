package test;

import cucumber.api.java.en.Given;

public class Steps {

    @Given("^I run a test$")
    public void test(){
        System.out.println("test");
    }
}
