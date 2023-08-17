package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import utest.utils.RandomGenerator;

public class FirstStepScreen {

    static String month = RandomGenerator.month();
    static String monthList= "option[label='" + month + "']";

    static String day = RandomGenerator.day();
    static String dayList = "option[label='" + day + "']";

    public static final Target FIRST_NAME = Target.the("First Name Text Box").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last Name Text Box").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email Text Box").located(By.id("email"));
    public static final Target BIRTH_MONTH_LIST = Target.the("Birth Month List").located(By.id("birthMonth"));
    public static final Target BIRTH_MONTH_VALUE = Target.the("Birth Month List Value").located(By.cssSelector(monthList));
    public static final Target BIRTH_DAY_LIST = Target.the("Birth Day List").located(By.id("birthDay"));
    public static final Target BIRTH_DAY_VALUE = Target.the("Birth Day List Value").located(By.cssSelector(dayList));
    public static final Target BIRTH_YEAR_LIST = Target.the("Birth YEAR List").located(By.id("birthYear"));
    public static final Target BIRTH_YEAR_VALUE = Target.the("Birth Year List Value").located(By.cssSelector("option[label='1998']"));
    public static final Target LANGUAGES = Target.the("Languages Text Box").located(By.cssSelector("html > body > ui-view > main > section > div > div:nth-child(2) > div > div:nth-child(2) > div > form > div:nth-child(1) > div:nth-child(3) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > input"));
    public static final Target NEXT_BUTTON = Target.the("Next Button").located(By.cssSelector("a[class='btn btn-blue']"));

    public static final Target FIRST_NAME_ERROR = Target.the("First Name Error").located(By.id("firstNameError"));
    public static final Target LAST_NAME_ERROR = Target.the("Last Name Error").located(By.id("lastNameError"));
    public static final Target EMAIL_ERROR = Target.the("Email Error").located(By.id("emailError"));

}
