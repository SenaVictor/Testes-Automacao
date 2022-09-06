package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import page.CadastroPages;
import runner.RunCucumbreTest;

public class CadastroSteps extends RunCucumbreTest {


    CadastroPages cadastroPage = new CadastroPages();

    String nome = "Jose";
    String sobrenome = "Santos";


    @Quando("^preencho o formulário de cadastro$")
    public void preencho_o_formulário_de_cadastro()  {
        cadastroPage.selectTitle(1);
        cadastroPage.preencherNome(nome);
        cadastroPage.preencherSobrenome(sobrenome);
        cadastroPage.preencherSenha("victor@sena21");
        cadastroPage.selecionarAniversario(12,8,"2000");
        cadastroPage.adrees("Rua acre");
        cadastroPage.city("Aracaju");
        cadastroPage.state("California");
        cadastroPage.postal_code("88800");
        cadastroPage.numero_telefone("55095959595959");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {
        cadastroPage.clique_registro();
    }

    @Então("^vejo o cadastro realizado com sucesso$")
    public void vejo_o_cadastro_realizado_com_sucesso()  {
        cadastroPage.valida_cadastro(nome , sobrenome);
    }

}
