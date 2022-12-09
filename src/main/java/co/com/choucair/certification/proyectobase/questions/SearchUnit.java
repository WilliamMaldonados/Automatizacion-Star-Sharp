package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchUnit implements Question<Boolean> {
    private String item;

    public SearchUnit(String item){this.item = item;}
public static SearchUnit theItemExist(String item){return new SearchUnit(item);}

    @Override
    public Boolean answeredBy(Actor actor) {
                return Text.of(MenuPage.Table_UNIT_CREATED).answeredBy(actor).equals(item);
    }
}
