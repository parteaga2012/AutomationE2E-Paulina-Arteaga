package starter.cart;

import net.serenitybdd.screenplay.targets.Target;

public class CompleteOrderPage {

    public static Target COMPLETE_ORDER_TEXT = Target.the("Order completed")
            .locatedBy("//h2[@data-test='complete-header']");

}
