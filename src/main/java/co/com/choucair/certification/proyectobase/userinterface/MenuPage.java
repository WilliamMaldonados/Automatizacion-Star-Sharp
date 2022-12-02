package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {

   public static final Target ORGANIZATION_MENU = Target.the("item organization in menu").located(By.xpath("//span[contains(text(), 'Organization')]"));
    public static final Target UNITS_LINK = Target.the("item organization in menu").located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target NEW_UNIT_BUTTON= Target.the("item organization in menu").located(By.xpath("//span[contains(text(), ' New Business Unit')]"));
    public static final Target NAME_INPUT = Target.the("item organization in menu").located(By.name("Name"));
    public static final Target PARENT_SELECT = Target.the("item organization in menu").located(By.xpath("//span[@class='select2-arrow']"));
    public static final Target PARENT_TECH = Target.the("item organization in menu").located(By.xpath("//div[@id='select2-drop']//ul//li[6]"));
    public static final Target CREATE_BUTTON = Target.the("item organization in menu").located(By.xpath("//span[contains(text(), ' Save')]"));
    public static final Target Table_UNIT_CREATED = Target.the("item organization in menu").located(By.xpath("//a[contains(text(), 'UnidadWill')]"));
}
