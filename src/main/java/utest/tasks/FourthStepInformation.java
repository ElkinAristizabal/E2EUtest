package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest.userinterfaces.FourthStepScreen;
import utest.utils.RandomGenerator;

import java.io.FileWriter;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FourthStepInformation implements Task {
    
    private static final String email = FirstStepInformation.with().email;
    private static final String password = RandomGenerator.password();




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(password).into(FourthStepScreen.UTEST_PASSWORD),
                Enter.theValue(password).into(FourthStepScreen.UTEST_PASSWORD_CONFIRM),
                Click.on(FourthStepScreen.CHECK_TERM_OF_USE),
                Click.on(FourthStepScreen.PRIVACY_SETTINGS),
                Click.on(FourthStepScreen.COMPLETE_SETUP_BUTTON)
        );
    }

    public static FourthStepInformation with ( ) {
        try {
            String fileName = "credentials.txt";
            String currentWorkingDirectory = System.getProperty("user.dir");
            String relativePath = "src/test/resources/utest/dataResult";
            String fullFilePath = currentWorkingDirectory + "/" + relativePath + "/" + fileName;
            FileWriter writer = new FileWriter(fullFilePath);
            writer.write("email: " + email + ", password: " + password);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
        return instrumented(FourthStepInformation.class);
    }
}
