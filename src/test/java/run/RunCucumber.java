package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "context",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }
)
public class RunCucumber {
}
