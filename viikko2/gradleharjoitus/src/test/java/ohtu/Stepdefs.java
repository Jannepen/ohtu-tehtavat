
package ohtu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    Multiplier multiplier;
    
    
    @Given("Multiplier is initialized")
    public void multiplierIsInitialized() {
        Multiplier = new Multiplier(5);
    }
    
    @When("it is multiplied by {int}")
    public void itIsMultiplied(Integer val) {
        multiplier.multipliedBy(val);
    }
}
