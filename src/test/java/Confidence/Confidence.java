package Confidence;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confidence {
@Test
    public void tstConfidence () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.confidencecambio.com.br/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("1500,00");

    }
}
