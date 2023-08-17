package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import utest.userinterfaces.ThirdStepScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ThirdStepInformation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ThirdStepScreen.OS_LIST),
                Click.on(ThirdStepScreen.OS_VALUE),
                Click.on(ThirdStepScreen.VERSION_LIST),
                Click.on(ThirdStepScreen.VERSION_VALUE),
                Click.on(ThirdStepScreen.LANGUAGE_LIST),
                Click.on(ThirdStepScreen.LANGUAGE_VALUE),
                Click.on(ThirdStepScreen.MOBILE_LIST),
                Click.on(ThirdStepScreen.MOBILE_VALUE),
                Click.on(ThirdStepScreen.MODEL_LIST),
                Click.on(ThirdStepScreen.MODEL_VALUE),
                Click.on(ThirdStepScreen.OS_MOBILE_LIST),
                Click.on(ThirdStepScreen.OS_MOBILE_VALUE),
                Click.on(ThirdStepScreen.LAST_STEP_BUTTON)
        );
    }
    public static ThirdStepInformation with ( ) {
        return instrumented(ThirdStepInformation.class);
    }
}
