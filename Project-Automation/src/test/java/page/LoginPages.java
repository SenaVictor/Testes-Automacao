package page;

import org.openqa.selenium.By;
import runner.RunCucumbreTest;
import support.Utils;

public class LoginPages extends RunCucumbreTest {

    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");


    public void acessarTelaLogin(){
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.esperarElementosEstarPresente(create_email_field, 10);
    }
    public void preencherCampoEmail(String randomEmail){

        getDriver().findElement(create_email_field).sendKeys(randomEmail);
    }
    public void clicarCriarContaBotao(){
        getDriver().findElement(create_email_button).click();
    }
}
