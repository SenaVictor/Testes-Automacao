package steps;

import cucumber.api.java.pt.Dado;
import page.LoginPages;
import runner.RunBase;
import runner.RunCucumbreTest;
import support.Utils;

public class LoginSteps extends RunCucumbreTest {

    LoginPages loginPages = new LoginPages();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login()  {
        getDriver(RunBase.Browser.CHROME);
        loginPages.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro do usuário$")
    public void acesso_o_cadastro_do_usuário()  {
        loginPages.preencherCampoEmail(Utils.getRandomEmail());
        loginPages.clicarCriarContaBotao();
    }
}
