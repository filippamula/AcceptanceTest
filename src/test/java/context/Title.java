package context;

import com.test.acceptance.AcceptanceSpecification;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Title extends AcceptanceSpecification {

    @When("Load page")
    public void load_Page() {
        webDriver = new ChromeDriver();
        webDriver.get(basicURL);
    }

    @Then("Check if the title is {string}")
    public void checkIfTheTitleIsCorrect(String title) {
       assert Objects.equals(webDriver.getTitle(), title);
    }

    @After
    public void cleanup(){
        webDriver.close();
    }
}
