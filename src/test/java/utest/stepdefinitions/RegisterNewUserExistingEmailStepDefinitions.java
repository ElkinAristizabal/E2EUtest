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
import utest.questions.ExistingEmail;
import utest.tasks.*;

public class RegisterNewUserExistingEmailStepDefinitions {

    @Managed(driver = "chrome")

    public WebDriver browser;
    private final Actor User = Actor.named("User");
    @Before
    public void setUP ()
    {
        User.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
    }
    @When("complete the first steps whit a existing {string} email")
    public void completeTheFirstStepsWhitAExistingEmail(String email) throws InterruptedException {
        User.wasAbleTo(FirstStepInformationExistingEmail.withExistingEmail(email),SecondStepInformation.with(), ThirdStepInformation.with(), FourthStepInformation.with());
        Thread.sleep(5000);
    }

    @Then("he should see in the screen a existing email message")
    public void heShouldSeeInTheScreenAExistingEmailMessage( ) {
        User.should(GivenWhenThen.seeThat(ExistingEmail.existingEmail(), Matchers.is(true)));
    }



}
