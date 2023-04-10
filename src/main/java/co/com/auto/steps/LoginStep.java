package co.com.auto.steps;

import co.com.auto.page.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginStep {

  @Page
  LoginPage loginPage;

  @Step
  public void login(){
  loginPage.open();
  }

  @Step
  public void logInSwagLabs(String userName, String password) {
    loginPage.typeUser(userName);
    loginPage.typePassword(password);
    loginPage.logIn();
  }

  @Step
  public void checkProductsDashboard() {
    loginPage.getProduct();
  }
  @Step
  public void checkErrorMessage() {
    loginPage.getError();
  }

}
