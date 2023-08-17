package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomeNewUserScreen {

    public static final Target CHECK_EMAIL_MESSAGE = Target.the("Check Email Message").located(By.cssSelector("p[class='welcome-lead']"));
}
