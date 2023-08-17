package utest.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUTest {

    public static final Target JOIN_BUTTON = Target.the("Join Today Button").located(By.cssSelector("html body ui-view unauthenticated-container div div unauthenticated-header div div:nth-child(3) ul:nth-child(2) li:nth-child(2) a"));


}
