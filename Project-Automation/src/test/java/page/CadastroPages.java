package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumbreTest;
import support.Utils;

public class CadastroPages extends RunCucumbreTest {


    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");

    private By select_day_filed = By.id("days");
    private By select_months_filed = By.id("months");
    private By select_years_filed = By.id("years");

    private By adrees_filed = By.id("address1");
    private By city_filed = By.id("city");
    private By state_filed = By.id("id_state");
    private By postalcode_filed = By.id("postcode");
    private By phone_mobile_filed = By.id("phone_mobile");

    private By submit_button = By.id("submitAccount");




    public void selectTitle(Integer type){
        Utils.esperarElementosEstarPresente(titleM, 20);
        if (type == 1){
            getDriver().findElement(titleM).click();
        } else if(type == 2) {
            getDriver().findElement(titleF).click();
        }
    }

    public void preencherNome(String nome){
        getDriver().findElement(first_name_field).sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome){
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preencherSenha(String senha){
        getDriver().findElement(password_field).sendKeys(senha);
    }

    public void selecionarAniversario(Integer dia, Integer mes, String ano){
        Select select_day = new Select(getDriver().findElement(select_day_filed));
        select_day.selectByIndex(dia);

        Select select_month = new Select(getDriver().findElement(select_months_filed));
        select_month.selectByIndex(mes);

        Select select_year = new Select(getDriver().findElement(select_years_filed));
        select_year.selectByValue(ano);
    }

    public void adrees(String endereco){
        getDriver().findElement(adrees_filed).sendKeys(endereco);
    }

    public void city (String cidade){
        getDriver().findElement(city_filed).sendKeys(cidade);
    }

    public void state (String estado){
        Select select_state = new Select(getDriver().findElement(state_filed));
        select_state.selectByVisibleText(estado);
    }

    public void postal_code (String codigopostal){
        getDriver().findElement(postalcode_filed).sendKeys(codigopostal);
    }

    public void numero_telefone(String telefone){
        getDriver().findElement(phone_mobile_filed).sendKeys(telefone);

    }

    public void clique_registro (){
        getDriver().findElement(submit_button).click();
    }

    public void valida_cadastro(String nome, String sobrenome){
        Utils.esperarElementosEstarPresente(By.className("button-search" ), 20);
        String resultado_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);
    }
}
