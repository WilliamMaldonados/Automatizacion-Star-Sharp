package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.StarSharpData;
import co.com.choucair.certification.proyectobase.questions.SearchUnit;
import co.com.choucair.certification.proyectobase.tasks.*;
import co.com.choucair.certification.proyectobase.userinterface.SharsharpPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Starsharpstepdefinitions {

    @Before
public void  setStage(){ setTheStage(new OnlineCast());}

    @Given("^that the user is on the star sharp page$")
    public void that_the_user_is_on_the_star_sharp_page() {
       theActorCalled("user").wasAbleTo(Openup.thepage());

    }


    @Given("^the user Logs in$")
    public void the_user_Logs_in(List<StarSharpData>data) {
        theActorInTheSpotlight().attemptsTo(Login.onThePage(data.get(0).getUser(),data.get(0).getPassword()));
          }

    @Given("^he go to the Bussines Units$")
    public void he_go_to_the_Bussines_Units() { theActorInTheSpotlight().attemptsTo(DasboardMenu.toBussines("unit"));


    }

    @When("^he create a new unit$")
    public void he_create_a_new_unit(List<StarSharpData>data) {
        theActorInTheSpotlight().attemptsTo(Menuhome.create(data));


    }

    @Then("^the (.*) should display in the menu$")
    public void the_UnidadWill_should_display_in_the_menu(String data) {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchUnit.theItemExist(data)));
    }

    @Given("^he go to meetings menu$")
    public void he_go_to_meetings_menu() {
        theActorInTheSpotlight().attemptsTo(DasboardMenu.toMeeting("Meeting"));
        }

    @When("^he create a meeting$")
    public void he_create_a_meeting(List<StarSharpData>data ) {
        theActorInTheSpotlight().attemptsTo(Meeting.create(data));
    }

    @Then("^the PruebaChoucair should display in the table$")
    public void the_PruebaChoucair_should_display_in_the_table(String data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(S));
    }










}
