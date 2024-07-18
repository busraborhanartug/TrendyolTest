package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

        WebDriver driver;
        private String tusId;
        public Sayfa(WebDriver driver){
            this.driver = driver;
    }
        public void elementGoruneneKadarBekle(String elementId) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
        }
        public void elementGoruneneKadarBekleCss(String elementId) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
        }
        public void elementGoruneneKadarBekleXpath(String elementId){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
        }



        public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
        this.tusId = tusId;
        }

        public void alanaYaziYaz(String elementId , String eMail){
        driver.findElement(By.id(elementId)).sendKeys(eMail);
        }
        public void alanaSifreYaz(String elementId , String password){
        driver.findElement(By.id(elementId)).sendKeys(password);
    }

        public void klavyeTusunaBas(String elementId, Keys klavyeTusu){
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
        }
        public void tusaBasXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
        }



}