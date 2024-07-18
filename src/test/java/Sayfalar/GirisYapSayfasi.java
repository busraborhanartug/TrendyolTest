package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{
    public final String eMail = "login-email";
    public final String password = "login-password-input";
    public final String girisYapButonu2 = "//button[@class='q-primary q-fluid q-button-medium q-button submit']/span[.='Giriş Yap']";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
