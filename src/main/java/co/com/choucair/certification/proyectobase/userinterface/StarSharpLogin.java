package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpLogin {

    public static final Target USER_NAME = Target.the("User name").located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("LoginPanel0_Password"));
    public static final Target BTN_SINGIN = Target.the("Boton sing in").located(By.id("LoginPanel0_LoginButton"));
}
