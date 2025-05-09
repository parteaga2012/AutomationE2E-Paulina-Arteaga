package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.cart.CartPage;
import starter.cart.CheckTheCart;
import starter.cart.CompleteOrderPage;
import starter.checkout.CheckoutPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;

public class CartStepDefinitions {

    @When("{actor} navigates to the cart")
    public void navigateToTheCart(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                CheckTheCart.andNavigate()
        );
    }

    @When("{actor} checks the following products are in the cart {string}")
    public void checksTheFollowingProductsAreInTheCart(Actor actor, String productNames) {

        String[] expectedProducts = productNames.split(",");

        theActorInTheSpotlight().should(
                seeThat("the expected products", ac -> CartPage.PRODUCT_NAMES.resolveAllFor(actor).texts(),
                        containsInAnyOrder(expectedProducts))
        );
    }

    @When("{actor} should see the text {string}")
    public void shouldSeeTheText(Actor actor, String expectedOrderText) {
        theActorInTheSpotlight().should(
                seeThat("the expected complete order text", ac -> CompleteOrderPage.COMPLETE_ORDER_TEXT.resolveFor(actor).getText(),
                        containsString(expectedOrderText))
        );
    }
}
