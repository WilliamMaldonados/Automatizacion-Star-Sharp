package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SharsharpPage;
import co.com.choucair.certification.proyectobase.userinterface.StarSharpLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Login implements Task {

    private String user;
    private String password;

    public Login(String user,String password){

        this.user = user;
        this.password= password;


}

public static Task onThePage(String user,String password){
        return Tasks.instrumented(Login.class,user,password);
}
@Override
public < T extends Actor> void performAs(T actor){
actor.attemptsTo(
        Enter.theValue(user).into(StarSharpLogin.USER_NAME),
        Enter.theValue(password).into(StarSharpLogin.PASSWORD),
        Click.on(StarSharpLogin.BTN_SINGIN)
        );
    }
}
