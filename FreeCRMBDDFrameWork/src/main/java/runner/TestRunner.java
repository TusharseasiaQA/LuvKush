package runner;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "E:\\java installation\\FreeCRMBDDFrameWork\\src\\main\\java\\freatures\\Login.feature",glue={""}

)
public class TestRunner {
}
