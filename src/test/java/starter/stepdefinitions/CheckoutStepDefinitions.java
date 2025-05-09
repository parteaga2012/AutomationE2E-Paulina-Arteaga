package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.cart.CartPage;
import starter.cart.CheckTheCart;
import starter.checkout.FillsTheCheckoutPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class CheckoutStepDefinitions {

    @When("{actor} navigates to the checkout page")
    public void navigateToTheCheckoutPage(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                CheckTheCart.andNavigateToCheckout()
        );
    }

    @When("{actor} fills the checkout page")
    public void fillsTheCheckoutPage(Actor actor) {
        actor.attemptsTo(
                FillsTheCheckoutPage.withInfo()
        );

    }
}

