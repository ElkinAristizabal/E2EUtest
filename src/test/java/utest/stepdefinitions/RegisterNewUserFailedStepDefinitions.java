package utest.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import utest.questions.ValidTextBoxes;
import utest.tasks.*;

public class RegisterNewUserFailedStepDefinitions {

    @Managed(driver = "chrome")

    public WebDriver browser;
    private final Actor User = Actor.named("User");
    @Before
    public void setUP ()
    {
        User.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
    }

    @When("doesn't complete the first steps whit his information")
    public void doesnTCompleteTheFirstStepsWhitHisInformation() {
        User.wasAbleTo(FirstStepInformationEmpty.with());
    }

    @Then("he should see in the screen a error message")
    public void heShouldSeeInTheScreenAWelcomeMessage() {
        User.should(GivenWhenThen.seeThat(ValidTextBoxes.validTextBoxes(), Matchers.is(true)));
    }

}
