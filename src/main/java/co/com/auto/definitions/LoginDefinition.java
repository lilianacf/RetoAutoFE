package co.com.auto.definitions;

import co.com.auto.steps.LoginStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {
  @Steps
  LoginStep loginStep;

  @Dado("que ingreso al sitio web www.saucedemo.com")
  public void login_page(){
    loginStep.login();
  }

  @Cuando("inicio sesión con el {string} y la {string}")
  public void log_in_swag_labs(String userName, String password) {
    loginStep.logInSwagLabs(userName, password);
  }

  @Entonces("visualizo el dashboard de productos de Swag Labs")
  public void check_product_dashboard() {
    loginStep.checkProductsDashboard();
  }

  @Entonces("visualizo el mensaje de error usuario o clave incorrecto")
  public void check_error_message() {
    loginStep.checkErrorMessage();
  }
}
