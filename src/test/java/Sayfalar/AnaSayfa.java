package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa{
    public final String girisYapButonu = "account-navigation-container";
    public final String kadinKategori = "//a[.='Kadın']";

    public final String erkekKategori = "//a[.='Erkek']";

    public final String favoriAlisveriseBasla = "//a[.='Alışverişe Başla']";

    public final String tumUrunler = "//div[@class='widget-container extended-container']//a[contains(.,'Tüm Ürünler')]";

    public final String cerezButon = "onetrust-accept-btn-handler";


    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
