package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.proyectobase.userinterface.MeetingPage.MEETINGS_LINK;
import static co.com.choucair.certification.proyectobase.userinterface.MeetingPage.MEETINGS_PAGE;
import static co.com.choucair.certification.proyectobase.userinterface.MenuPage.ORGANIZATION_MENU;
import static co.com.choucair.certification.proyectobase.userinterface.MenuPage.UNITS_LINK;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DasboardMeet implements Task {

    public static DasboardMeet toMeeting (String objetiveMeet){return Tasks.instrumented(DasboardMeet.class,objetiveMeet);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
        Check.whether(actor.asksFor (Visibility.of(MEETINGS_LINK))
                )
                .andIfSo(
                        Click.on(MEETINGS_LINK),
                        WaitUntil.the(MEETINGS_LINK, isCurrentlyVisible())
                                .forNoMoreThan(60).seconds(),
                        Click.on(MEETINGS_PAGE)
                )
                .performAs(actor);
    }

}


