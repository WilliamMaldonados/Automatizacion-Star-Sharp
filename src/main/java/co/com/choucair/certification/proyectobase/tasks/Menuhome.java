package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectobase.userinterface.MenuPage.*;

public class Menuhome implements Task {

    private String nameunit;
    private String paretunit;

    public Menuhome(String nameunit, String paretunit){
        this.nameunit = nameunit;
        this.paretunit =paretunit;
    }

public static Performable withData (String nameunit, String paretunit){
        return Tasks.instrumented(Menuhome.class,nameunit, paretunit);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST_ORGANIZATION),
                Click.on(LIST_BUSINESS_UNITS),
                Click.on(BUTTON_NEW_BUSINESS_UNITS),
                Enter.theValue(nameunit).into(INPUT_NAME_BUSINESS_UNITS),
                Click.on(SELECT_PARENT_UNIT),
                Click.on(INPUT_PARENT_UNIT),
                Enter.theValue(paretunit).into(INPUT_PARENT_UNIT).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE)

        );
    }
}
