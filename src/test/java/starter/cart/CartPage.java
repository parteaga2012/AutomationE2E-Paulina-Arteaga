package starter.cart;

import net.serenitybdd.screenplay.targets.Target;
public class CartPage {

    public static Target PRODUCT_NAMES = Target.the("Cart product names")
            .locatedBy("//div[@data-test='inventory-item-name']");

    static Target SHOPPING_CART_ICON = Target.the("shopping cart icon").locatedBy("//a[@data-test='shopping-cart-link']");

    static Target CHECKOUT_BUTTON = Target.the("shopping cart icon").locatedBy("#checkout");

    static Target CONTINUE_SHOPPING = Target.the("shopping cart icon").locatedBy("#continue-shopping");
}
