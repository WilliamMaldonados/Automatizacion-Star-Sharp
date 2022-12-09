package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {

    public static final Target ORGANIZATION_MENU = Target.the("item organization in menu").located(By.xpath("//span[contains(text(), 'Organization')]"));
    public static final Target UNITS_LINK = Target.the("item unit link").located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target NEW_UNIT_BUTTON= Target.the("new unit button").located(By.xpath("//span[contains(text(), '  Nuevo Business Unit')]"));
    public static final Target NAME_INPUT = Target.the("input name").located(By.name("Name"));
    public static final Target PARENT_SELECT = Target.the("parent select").located(By.xpath("//span[@class='select2-arrow']"));
    public static final Target PARENT_TECH = Target.the("parent tech").located(By.xpath("//div[@id='select2-drop']//ul//li[6]"));
    public static final Target CREATE_BUTTON = Target.the("button create").located(By.xpath("//span[contains(text(), ' Save')]"));
    public static final Target Table_UNIT_CREATED = Target.the("table unit create").located(By.xpath("//a[contains(text(), 'UnidadWill')]"));
}
