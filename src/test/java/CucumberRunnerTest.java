import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"},
        plugin = { "pretty", "html:target/htmlreports", "json:target/cucumber.json" },
        glue = "steps"
)
public class CucumberRunnerTest {
}
