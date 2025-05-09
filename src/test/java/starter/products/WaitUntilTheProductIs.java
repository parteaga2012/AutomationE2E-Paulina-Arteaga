package starter.products;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WaitUntilTheProductIs {
    public static Performable addedToTheCart(String productName) {
        return Task.where(
                WaitUntil.the(ProductsList.REMOVE_ITEM_FROM_CART_BUTTON.inside(ProductsList.PRODUCT_ITEM_BY_NAME.of(productName)), WebElementStateMatchers.isVisible())
        );
    }
}
