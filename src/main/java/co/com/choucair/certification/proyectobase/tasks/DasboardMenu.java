package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;



import static co.com.choucair.certification.proyectobase.userinterface.MenuPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;



public class DasboardMenu implements Task {

    private String objetive;


    public DasboardMenu(String objetive){this.objetive=objetive;}

    public static DasboardMenu toBussines (String objetive){return Tasks.instrumented(DasboardMenu.class,objetive);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
        Check.whether(actor.asksFor (CurrentVisibility.of(ORGANIZATION_MENU))
                )
                .andIfSo(
                        Click.on(ORGANIZATION_MENU),
                        WaitUntil.the(ORGANIZATION_MENU, isCurrentlyVisible())
                                .forNoMoreThan(30).seconds(),
                        Click.on(UNITS_LINK)
                                )
                               .performAs(actor);


    }

}


