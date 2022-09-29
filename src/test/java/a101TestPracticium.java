import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class a101TestPracticium {

        @Test
        public void a101TestPracticiumPatika() throws InterruptedException {

                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                Actions actions = new Actions(driver);
                JavascriptExecutor js = (JavascriptExecutor) driver;


                driver.get("https://www.a101.com.tr/");
                driver.findElement(By.cssSelector("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
                WebElement giyim = driver.findElement(By.cssSelector("body > section > section.container-fluid.p-0 > div > div > div > div.col-md-8.col-sm-8.hidden-xs.desktop-navigation-wrapper > div > div > ul > li:nth-child(4) > a"));
                actions.moveToElement(giyim).perform();
                driver.findElement(By.cssSelector("body > section > section.container-fluid.p-0 > div > div > div > div.col-md-8.col-sm-8.hidden-xs.desktop-navigation-wrapper > div > div > ul > li:nth-child(4) > div > div.container > div > div > div.col-sm-10.submenu-items > ul:nth-child(2) > li:nth-child(8) > a")).click();
                driver.findElement(By.cssSelector("body > section > section.page-list.js-container > div:nth-child(3) > div.content > div > div.col-md-10.col-sm-9 > div.products-list > div > ul > li:nth-child(1) > article > div > a > figure > img")).click();
                String bsiyahcorap = "Seçılen Renk: SİYAH";
                String gsiyahcorap = driver.findElement(By.cssSelector("body > section > section.page-product.js-product-container.js-product-init > div.container > div.content > div > div.row > div.col-sm-9 > div.row > div:nth-child(2) > div > div.variants-bar > div > div.selected-variant-text")).getText();
                Assert.assertEquals(bsiyahcorap, gsiyahcorap);
                System.out.println(gsiyahcorap);
                driver.findElement(By.cssSelector("body > section > section.page-product.js-product-container.js-product-init > div.container > div.content > div > div.row > div.col-sm-3 > div.product-buy-info.js-product-buy-info > button")).click();
                driver.findElement(By.cssSelector("#js-modal-basket > div.right-side > a.go-to-shop")).click();
                driver.findElement(By.cssSelector("body > section > div.page-basket > div.container.js-basket-container > div > div.col-sm-3 > div > a")).click();
                driver.findElement(By.cssSelector("body > section > div.page-auth > div > div.row.js-block-user.login-row > div:nth-child(1) > div.auth__form__proceed__wrapper > a")).click();
                driver.findElement(By.cssSelector("body > section > div.page-auth > div > div.row.js-block-email > div > div > form > div.field > input")).sendKeys("a101ilepatika@gmail.com");
                driver.findElement(By.cssSelector("body > section > div.page-auth > div > div.row.js-block-email > div > div > form > button")).click();
                driver.findElement(By.cssSelector("body > section > section > div > div.checkout-addresses.js-tab-content.active > div > div.col-sm-9 > div > div.addresses > div.list > ul:nth-child(3) > li > a")).click();
                WebElement evadresim = driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(3) > div > div > label > input[type=text]"));
                actions.click(evadresim)
                        .sendKeys("Ev adresim")
                        .sendKeys(Keys.TAB)
                        .sendKeys("Berke Yasir")
                        .sendKeys(Keys.TAB)
                        .sendKeys("BİBER")
                        .sendKeys(Keys.TAB)
                        .sendKeys("5433379104")
                        .sendKeys(Keys.TAB)
                        .sendKeys("İSTANBUL").perform();
                WebElement ilce = driver.findElement(By.xpath("//option[text()='ADALAR']"));
                ilce.click();
                Thread.sleep(500);
                WebElement mahalle = driver.findElement(By.xpath("//option[text()='BURGAZADA MAH']"));
                mahalle.click();
                WebElement adres = driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(9) > label > textarea"));
                adres.sendKeys("ppatikaa ile aa101 ppracticium");
                driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > button.button.green.js-set-country.js-prevent-emoji")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("body > section > section > div > div.checkout-addresses.js-tab-content.active > div > div.col-sm-9 > div > div.continue > form > div.cargo > div.cargo-list > ul > li:nth-child(1) > label > div.price")).click();
                driver.findElement(By.cssSelector("body > section > section > div > div.checkout-addresses.js-tab-content.active > div > div.col-sm-9 > div > div.continue > form > div.cargo > button")).click();
                String bodemesecenek = "2. ÖDEME SEÇENEKLERİ";
                String godemesecenek = driver.findElement(By.xpath("//span[text()='2. ÖDEME SEÇENEKLERİ']")).getText();
                Assert.assertEquals(bodemesecenek,godemesecenek);
                System.out.println(godemesecenek);
                String bkartileodeme="Kart ile ödeme";
                String gkartileodeme=driver.findElement(By.cssSelector("body > section > section > div > div.checkout-payment.js-tab-content.active > div.payment-tabs > div.payment-tab.payment-tab-masterpass.js-payment-tab.active")).getText();
                Assert.assertEquals(bkartileodeme,gkartileodeme);
                System.out.println(gkartileodeme);
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("body > section > section > div > div.checkout-payment.js-tab-content.active > div.payment-tabs > div.payment-tab.payment-tab-gpay.js-payment-tab")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("body > section > section > div > div.checkout-payment.js-tab-content.active > div.row > div.col-sm-9 > div.payment-area.js-payment-tab-content.gpay-content.active > div.content.js-gpay-content > label > div:nth-child(1) > input")).click();
                driver.findElement(By.cssSelector("body > section > section > div > div.checkout-payment.js-tab-content.active > div.row > div.col-sm-9 > div.payment-area.js-payment-tab-content.gpay-content.active > div.gpay-button-customize > a")).click();
                Thread.sleep(2000);
                String ggarantipay=driver.findElement(By.cssSelector("#gvps-general-tab-link-gpay")).getText();
                System.out.println(ggarantipay);


        }























































        }
