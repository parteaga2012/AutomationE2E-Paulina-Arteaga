package starter.checkout;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillsTheCheckoutPage {

    public static Performable withInfo() {
        return Task.where("{0} fills the checkout page",
                Enter.theValue("Paulina")
                        .into(CheckoutPage.FIRST_NAME),
                Enter.theValue("Arteaga")
                        .into(CheckoutPage.LAST_NAME),
                Enter.theValue("87653")
                        .into(CheckoutPage.POSTAL_CODE),
                Click.on(CheckoutPage.CONTINUE),
                Click.on(CheckoutPage.FINISH)
        );
    }
}
