package co.com.auto.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

 public LoginPage(WebDriver driver) {
   super(driver);
 }


  @FindBy(id = "user-name")
  public WebElementFacade txtUsername;

  @FindBy(id = "password")
  public WebElementFacade txtpassword;

  @FindBy(id = "login-button")
  public WebElementFacade btnlogin;

  public void typePassword(String password) {
    txtpassword.type(password);
  }

  public void typeUser(String userName) {
    txtUsername.type(userName);
  }

  public void logIn() {
    btnlogin.click();
  }

  public void getProduct(){
    //findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
  }

  public void getError() {
    getDriver().findElement(By.xpath("//div[contains(@class, 'error-message-container error')]"));
  }

}
