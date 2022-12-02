package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchMeet implements Question<Boolean> {
    private String item;

    public SearchMeet(String item){this.item=item;}

    public static SearchMeet theItemExist(String item){ return new SearchMeet(item);}

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MeetingPage.TABLE_MEET_CREATED).viewedBy(actor).asString().equals(item);
    }
}
