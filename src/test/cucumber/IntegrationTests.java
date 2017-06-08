import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(SpringProfileCucumber.class)
@CucumberOptions(format = "pretty", features = "src/test/cucumber/feature")
public class IntegrationTests {
}
