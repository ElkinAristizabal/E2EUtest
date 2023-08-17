package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import utest.userinterfaces.HomePageUTest;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToJoin implements Task {


    @Override
    @Step("{1} click on Join Today button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageUTest.JOIN_BUTTON)
        );
    }
    public static GoToJoin click (){
        return instrumented(GoToJoin.class);
    }
}
