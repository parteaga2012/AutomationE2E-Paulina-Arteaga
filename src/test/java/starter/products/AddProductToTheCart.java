package starter.products;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddProductToTheCart {

    public static Performable withName(String productName) {
        return Task.where("{0} he adds the product with name {string} to the cart",
                Click.on(ProductsList.ADD_ITEM_TO_CART_BUTTON.inside(ProductsList.PRODUCT_ITEM_BY_NAME.of(productName)))
        );
    }
}
