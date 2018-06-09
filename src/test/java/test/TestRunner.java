package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = {
        "json:target/cucumber/results.json",
        "html:target/cucumber/results.html",
        "pretty"
    },
    features = "src/test/resources/features",
    tags = {"~@ignored"}
)

public class TestRunner {
}
