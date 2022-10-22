package Cadastro;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cadastro{
    @Test
    public void Cadastro () throws InterruptedException {
        WebDriver driver ;
        driver = new ChromeDriver();
        driver.get("https://www.qaacademy.com.br/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdip8']")).sendKeys("Marilia Fernandes");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdiq1']")).sendKeys("matiju41@gmail.com");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdipq']")).sendKeys("1194122-1292");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdiqj']")).sendKeys("R Francisco Antonio Leite, 160");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdiqy']")).sendKeys("Duvidas Teste");
        driver.findElement(By.xpath("//textarea[@id='textarea_comp-k37gdirc']")).sendKeys("Gostaria de informações sobre o curso");
        driver.findElement(By.xpath("//div[@id='comp-k37gdiro']")).click();
        Thread.sleep(2000);
        driver.quit();

    }

}
