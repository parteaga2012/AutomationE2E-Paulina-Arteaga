package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.login.LoginWith;
import starter.navigation.NavigateTo;

public class LoginStepDefinitions {

    @Given("{actor} wants to buy a new product")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLoginPage());
    }

    @When("{actor} enters the username {string} and password {string}")
    public void searchesFor(Actor actor, String username, String password) throws InterruptedException {
        actor.attemptsTo(LoginWith.credentials(username, password)

        );
        // Thread.sleep(10_000);
    }
}
