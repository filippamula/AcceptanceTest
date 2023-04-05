package context;

import com.test.acceptance.AcceptanceSpecification;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Search extends AcceptanceSpecification {

    @When("Search {string}")
    public void search(String searchArgument) {
        webDriver.findElement(By.id("W0wltc")).click();
        var input = webDriver.findElement(By.className("gLFyf"));
        input.sendKeys(searchArgument);
        input.sendKeys(Keys.ENTER);
    }

    @Then("Check if path have {string}")
    public void checkIfPathHave(String argument) {
        System.out.println(webDriver.getCurrentUrl());
        assert webDriver.getCurrentUrl().contains(argument);
    }
}
