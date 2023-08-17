package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import utest.userinterfaces.UTestPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowserOnUTest implements Task {

    @Override
    @Step("{0} open the browser on UTest Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new UTestPage()));

    }
    public static OpenTheBrowserOnUTest on (){
        return instrumented(OpenTheBrowserOnUTest.class);
    }
}
