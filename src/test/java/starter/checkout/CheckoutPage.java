package starter.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

     static Target FIRST_NAME = Target.the("First name")
            .locatedBy("#first-name");

    static Target LAST_NAME = Target.the("last name")
            .locatedBy("#last-name");

    static Target POSTAL_CODE = Target.the("zip code")
            .locatedBy("#postal-code");

    static Target CONTINUE = Target.the("Continue button")
            .locatedBy("#continue");

    static Target FINISH = Target.the("Finish button")
            .locatedBy("#finish");
}
