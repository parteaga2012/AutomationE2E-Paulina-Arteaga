package starter.products;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsList {
    static Target PRODUCT_ITEM_BY_NAME = Target.the("product items")
            .locatedBy("//div[@data-test='inventory-container']//div[@data-test='inventory-item']//a/div[contains(., '{0}')]/ancestor::div[@data-test='inventory-item']");

    static Target ADD_ITEM_TO_CART_BUTTON = Target.the("Add item to cart").locatedBy("//button[contains(., 'Add to cart')]");

    static Target REMOVE_ITEM_FROM_CART_BUTTON = Target.the("Remove item from cart").locatedBy("//button[contains(., 'Remove')]");

}
