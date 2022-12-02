package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SharsharpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.proyectobase.userinterface.SharsharpPage.PASSWORD;

public class Login implements Task {

    private String user;
    private String password;

    public Login(String user,String password){

        this.user = user;
        this.password= password;


}

public static Performable withData (String user,String password){
        return Tasks.instrumented(Login.class,user,password);
}
@Override
public < T extends Actor> void performAs(T actor){
actor.attemptsTo(
        Enter.theValue(user).into(SharsharpPage.USER_NAME),
        Enter.theValue(password).into(PASSWORD),
        Click.on(SharsharpPage.BTN_SINGIN)
        );
    }
}
