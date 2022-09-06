package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("http://www.qazando.com.br/curso.html");
        esperarElementosEstarPresente(By.id("btn-ver-cursos"), 10);
        Assert.assertEquals("Nao acessou a aplicaçao",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }
    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("victor@gmail.com");

    }
    public void clickGanharDesconto(){

        driver.findElement(By.id("button")).click();
    }
    public void verificarCupomDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("o cupom esta errado", "QAZANDO15OFF", texto_cupom);
    }
}
