package starter.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CheckTheCart {
    public static Performable andNavigate() {
        return Task.where("{0} clicks on the shopping cart",
                Click.on(CartPage.SHOPPING_CART_ICON),
                Ensure.that(CartPage.CHECKOUT_BUTTON).isDisplayed(),
                Ensure.that(CartPage.CONTINUE_SHOPPING).isDisplayed()
        );
    }

    public static Performable andNavigateToCheckout() {
        return Task.where("{0} clicks on the checkout page ",
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }
}
