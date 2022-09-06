package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumbreTest;

import java.util.Random;

public class Utils extends RunCucumbreTest {

    public static void esperarElementosEstarPresente(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomEmail() {

        String email_init = "victor_";
        String email_final = "@yahoo.com.br";
        Random random = new Random();

        int minimo = 0;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;

    }
}
