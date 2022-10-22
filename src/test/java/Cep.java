import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Cep {
@Test
    public void testCep () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.findElement(By.id("endereco")).sendKeys("13073-010");
        driver.findElement(By.id("btn_pesquisar")).click();
        Thread.sleep(2000);
        String cep = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals(cep,"Rua Buarque de Macedo - até 1310/1311");


    }
@Test
    public void testCep2 () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.findElement(By.id("endereco")).sendKeys("13073-010");
        Select select = new Select (driver.findElement(By.id("tipoCEP")));
        select.selectByVisibleText("Localidade/Logradouro");//)
        driver.findElement(By.id("btn_pesquisar")).click();
        Thread.sleep(2000);
        String cep = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals(cep,"Rua Buarque de Macedo - até 1310/1311");

    }

}
