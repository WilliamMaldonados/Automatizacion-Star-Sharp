package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.MenuPage.*;

public class Menuhome implements Task {

private String data;

public Menuhome(String data){this.data=data;}

    public static Menuhome create (String data){return Tasks.instrumented(Menuhome.class,data);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEW_UNIT_BUTTON),
                Enter.theValue(data).into(NAME_INPUT),
                Click.on(PARENT_SELECT),
                Click.on(PARENT_TECH),
                Click.on(CREATE_BUTTON)


        );
    }
}
