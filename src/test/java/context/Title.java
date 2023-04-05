package context;

import com.test.acceptance.AcceptanceSpecification;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Title extends AcceptanceSpecification {

    @BeforeAll
    public static void initBrowser(){
        webDriver = new ChromeDriver();
    }

    @When("Load page")
    public void load_Page() {
        webDriver.get(basicURL);
    }

    @Then("Check if the title is {string}")
    public void checkIfTheTitleIsCorrect(String title) {
       assert Objects.equals(webDriver.getTitle(), title);
    }

    @AfterAll
    public static void cleanup(){
        webDriver.close();
    }
}
