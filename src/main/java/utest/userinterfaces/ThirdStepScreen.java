package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThirdStepScreen {

    public static final Target OS_LIST = Target.the("OS List").locatedBy("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span");
    public static final Target OS_VALUE = Target.the("OS List Value").located(By.xpath("//div[contains(text(), 'Linux')]"));
    public static final Target VERSION_LIST = Target.the("Version List").located(By.cssSelector("span[aria-label='Select a Version']"));
    public static final Target VERSION_VALUE = Target.the("Version LIst Value").located(By.xpath("//div[contains(text(), 'Ubuntu')]"));
    public static final Target LANGUAGE_LIST = Target.the("Language List").located(By.cssSelector("span[aria-label='Select OS language']"));
    public static final Target LANGUAGE_VALUE = Target.the("Language List Value").located(By.xpath("//div[contains(text(), 'Spanish')]"));
    public static final Target MOBILE_LIST = Target.the("Mobile List").located(By.cssSelector("span[aria-label='Select Brand']"));
    public static final Target MOBILE_VALUE = Target.the("Mobile List Value").located(By.xpath("//div[contains(text(), 'Apple')]"));
    public static final Target MODEL_LIST = Target.the("Model List").located(By.cssSelector("span[aria-label='Select a Model']"));
    public static final Target MODEL_VALUE = Target.the("Model List Value").located(By.xpath("//div[text() = 'iPhone 12']"));
    public static final Target OS_MOBILE_LIST = Target.the("OS Mobile List").locatedBy("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span");
    public static final Target OS_MOBILE_VALUE = Target.the("OS Mobile List Value").located(By.xpath("//div[text() = 'iOS 16.6']"));
    public static final Target LAST_STEP_BUTTON = Target.the("Last Step Button").located(By.cssSelector("a[class='btn btn-blue pull-right']"));

}
