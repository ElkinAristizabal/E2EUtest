package utest.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import utest.questions.CheckEmailMessage;
import utest.tasks.*;

public class RegisterNewUserSuccesfullyStepDefinitions {

    @Managed(driver = "chrome")

    public WebDriver browser;
    public final Actor User = Actor.named("User");
    @Before
    public void setUP ()
    {
        User.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
    }

    @Given("a new user is going to join")
    public void aNewUserIsGoingToJoin(){
        User.wasAbleTo(OpenTheBrowserOnUTest.on(),GoToJoin.click());

    }
    @When("complete the four steps whit his information")
    public void completeTheFourStepsWhitHisInformation() throws InterruptedException {
        User.wasAbleTo(FirstStepInformation.with(),SecondStepInformation.with(), ThirdStepInformation.with(), FourthStepInformation.with());
        Thread.sleep(5000);

    }
    @Then("he should see in the screen a welcome message")
    public void heShouldSeeInTheScreenAWelcomeMessage() {
        User.should(GivenWhenThen.seeThat(CheckEmailMessage.checkEmailMessage(), Matchers.is(true)));
    }
}

