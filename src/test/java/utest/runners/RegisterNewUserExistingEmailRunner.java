package utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/utest/features",
        glue = "utest.stepdefinitions",
        tags = "@RegisterNewUserExistingEmail",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegisterNewUserExistingEmailRunner {
}
