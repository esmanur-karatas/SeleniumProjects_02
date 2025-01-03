package textBoxTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class textBoxTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/text-box sayfasına git
        String url = "https://demoqa.com/text-box";
        driver.get(url);

        //fullname içine gir adını yazdır
        WebElement fullNameText = driver.findElement(By.id("userName"));
        fullNameText.sendKeys("Esmanur Karataş");

        //email kısmına gir mailini yazdır
        WebElement emailText = driver.findElement(By.id("userEmail"));
        emailText.sendKeys("esman@gmail.com");

        //adres kısmını locate et adresini yazdır
        WebElement addressText = driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
        addressText.sendKeys("Elazığ/Merkez");

        //permanent adres kısmına adres yazdır
        WebElement permanentAddressText = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddressText.sendKeys("Elazığ");

        //submit butonu altta kalıyor diye sayfayı 1 kare aşağı indirelim
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        //submit butonuna bas gönder.
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        //consola test başarılı ve alanların içindeki değerleri yazdır
        WebElement dogrulama = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']"));
        if(dogrulama.isEnabled()) {
            System.out.println("Test Başarılı!");
            System.out.println("Test verileri:\n" + dogrulama.getText());
        }


        //browserı kapat
        Thread.sleep(2000);
        driver.quit();
    }
}
