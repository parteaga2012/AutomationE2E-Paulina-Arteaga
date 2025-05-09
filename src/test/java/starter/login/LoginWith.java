package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginWith {

    public static Performable credentials(String username, String password) {
        return Task.where("{0} logs in '" + username + "'",
                Enter.theValue(username)
                        .into(LoginForm.USERNAME_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        );
    }
}
