package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FourthStepScreen {

    public static final Target UTEST_PASSWORD = Target.the("uTest password Text Box").located(By.id("password"));
    public static final Target UTEST_PASSWORD_CONFIRM = Target.the("uTest password Confirm Text Box").located(By.id("confirmPassword"));
    public static final Target CHECK_TERM_OF_USE = Target.the("Check Term Of Use").located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTINGS = Target.the("Privacy Setting").located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Complete SetUp Button").located(By.id("laddaBtn"));
    public static final Target MESSAGE_EXISTING_EMAIL = Target.the("Message Existing Email").located(By.cssSelector(" div[ng-transclude='']"));

}
