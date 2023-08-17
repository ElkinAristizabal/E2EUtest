package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondStepScreen {

    public static final Target CITY = Target.the("City Text Box").located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Postal Code Text Box").located(By.id("zip"));
    public static final Target COUNTRY_LIST = Target.the("Country List").located(By.cssSelector("span[class='ui-select-match-text pull-left']"));
    public static final Target COUNTRY_VALUE = Target.the("Country List Value").located(By.xpath("//div[contains(text(), 'Colombia')]"));
    public static final Target NEXT_BUTTON = Target.the("Next Button").located(By.cssSelector("a[class='btn btn-blue pull-right']"));
    public static final Target VALIDATION_MESSAGE = Target.the("Validation Message").located(By.cssSelector("ng-message[when='validationMatch']"));
    public static final Target VALIDATION_MESSAGE_AUTODETECT_CITY = Target.the("Validation Message Autodetect City").located(By.cssSelector("span[ng-show='autoDetectAddress.city']"));
    public static final Target VALIDATION_MESSAGE_AUTODETECT_POSTAL_CODE = Target.the("Validation Message Autodetect Postal Code").located(By.cssSelector("span[ng-show='autoDetectAddress.zip']"));

}
