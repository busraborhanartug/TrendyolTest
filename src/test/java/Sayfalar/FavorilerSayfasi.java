package Sayfalar;

import org.openqa.selenium.WebDriver;

public class FavorilerSayfasi extends Sayfa{
    public final String favoriAlisveriseBasla1 = "//a[.='Alışverişe Başla']";
    public FavorilerSayfasi(WebDriver driver) {
        super(driver);
    }
}
