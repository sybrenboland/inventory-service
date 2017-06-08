package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import resource.InventoryApplication;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = InventoryApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration
public class InventorySteps {

    @Autowired
    private TestRestTemplate restTemplate;

    private Product[] responseEntity;

    @When("^I ask for the products")
    public void i_ask_for_the_basket() throws Throwable {

        responseEntity = restTemplate
                .getForObject("http://localhost:8882".concat("/").concat("products"), Product[].class);
    }

    @Then("^(?:I get|the user gets) a '(.*)' results$")
    public void I_get_a__response(final String numberOfResults) throws Throwable {
        assertEquals(Integer.valueOf(numberOfResults), new Integer(responseEntity.length));
    }
}
