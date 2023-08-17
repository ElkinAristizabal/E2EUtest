package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import utest.userinterfaces.FirstStepScreen;
import utest.userinterfaces.SecondStepScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FirstStepInformationEmpty implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(FirstStepScreen.NEXT_BUTTON));
    }

    public static FirstStepInformationEmpty with () {
        return instrumented(FirstStepInformationEmpty.class);
    }

}
