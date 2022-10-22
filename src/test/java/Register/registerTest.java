package Register;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class registerTest {
@Test
    public void cadastro (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Marilia");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Fernandes");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("R Francisco Antonio Leite, 160");
        driver.findElement((By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]"))).sendKeys("marilia.vazfernandes@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("11941221292");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        select.selectByVisibleText("Java");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[2]")).click();
        driver.findElement(By.id("firstpassword")).sendKeys("julia");
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("julia");



    }


}
