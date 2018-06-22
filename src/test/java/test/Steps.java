package test;

import cucumber.api.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Steps {

    Logger systemLogger = LogManager.getLogger("systemLogger");
    Logger resultsLogger = LogManager.getLogger("resultsLogger");

    @Given("^I run a test$")
    public void test(){
        System.out.println("test");
        systemLogger.info("system log info message");
        resultsLogger.info("results log info message");
        System.out.println(systemLogger);
    }
}
