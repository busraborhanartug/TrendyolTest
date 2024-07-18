package Tests;

import Sayfalar.AnaSayfa;
import Sayfalar.FavorilerSayfasi;
import Sayfalar.GirisYapSayfasi;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class TrendyolTests {

private WebDriver driver;
private AnaSayfa anaSayfa;
private GirisYapSayfasi girisYapSayfasi;

private FavorilerSayfasi favorilerSayfasi;
 @BeforeEach

void setup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    anaSayfa = new AnaSayfa(driver);
    girisYapSayfasi = new GirisYapSayfasi(driver);
    favorilerSayfasi = new FavorilerSayfasi(driver);
    driver.get("https://www.trendyol.com/");
 }

 @Test
void trendyolLoginTest() throws InterruptedException {
     anaSayfa.elementGoruneneKadarBekle(anaSayfa.cerezButon);
     anaSayfa.tusaBas(anaSayfa.cerezButon);
     anaSayfa.elementGoruneneKadarBekle(anaSayfa.girisYapButonu);
     anaSayfa.tusaBas(anaSayfa.girisYapButonu);

     girisYapSayfasi.elementGoruneneKadarBekle(girisYapSayfasi.eMail);
     girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.eMail, "sercan.cataltepe.bites@gmail.com");
     girisYapSayfasi.alanaSifreYaz(girisYapSayfasi.password, "Bites0396");
     girisYapSayfasi.tusaBasXpath(girisYapSayfasi.girisYapButonu2);

     favorilerSayfasi.elementGoruneneKadarBekleXpath(favorilerSayfasi.favoriAlisveriseBasla1);
     //Thread.sleep(200);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
     //favorilerSayfasi.klavyeTusunaBas(favorilerSayfasi.favoriAlisveriseBasla1, Keys.ESCAPE);
     favorilerSayfasi.tusaBasXpath(favorilerSayfasi.favoriAlisveriseBasla1);

    //anaSayfa.elementGoruneneKadarBekleXpath(anaSayfa.kadinKategori);
    //anaSayfa.tusaBasXpath(anaSayfa.kadinKategori);
    //anaSayfa.elementGoruneneKadarBekleXpath(anaSayfa.tumUrunler);
    //anaSayfa.tusaBasXpath(anaSayfa.tumUrunler);
    }
    //@AfterEach
    //void tearDown(){
    //    driver.close();
    //}
}
