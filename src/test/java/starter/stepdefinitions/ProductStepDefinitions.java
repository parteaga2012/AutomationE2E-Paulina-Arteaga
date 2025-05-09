package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.products.AddProductToTheCart;
import starter.products.WaitUntilTheProductIs;

public class ProductStepDefinitions {

    @When("{actor} adds the product with name {string} to the cart")
    public void addsAProduct(Actor actor, String productName) throws InterruptedException {
        actor.attemptsTo(
                AddProductToTheCart.withName(productName),
                WaitUntilTheProductIs.addedToTheCart(productName)
        );
        //Thread.sleep(5_000);
    }

}
