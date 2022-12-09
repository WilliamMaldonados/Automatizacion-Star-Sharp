package co.com.choucair.certification.proyectobase.runners;




import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/Starsharp.feature",
        tags= "@stories",
        glue="co.com.choucair.certification.proyectobase.stepdefinitions",

        snippets= CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}