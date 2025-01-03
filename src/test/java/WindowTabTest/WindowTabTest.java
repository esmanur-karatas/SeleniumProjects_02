package WindowTabTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowTabTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/browser-windows adresine git
        driver.get("https://demoqa.com/browser-windows");

        //new tab butonuna tıkla
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        //iki tane tab(sekme) olduğunu görebilmek için bir tane liste oluşturuyoruz
        //getWindowHandle() metodu, Selenium'da aktif olan tarayıcı penceresinin benzersiz tanımlayıcısını (unique identifier) döner.
        //
        //Kullanım Amacı:
        //Çoklu tarayıcı sekmeleri veya pencereleri ile çalışırken, belirli bir pencereye geri dönmek için bu metot kullanılır.
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //size() metodu ile kaç tane sekme ya da pencere olduğunu yazdırır ekrana
        System.out.println("Kaç sekme açık: " + tabs.size());
        //diğer pencereye geçiş yapmak için
        driver.switchTo().window(tabs.get(1));
        //geçilen sayfanın url öğrenmek için getCurrentUrl() metodu kullandık
        System.out.println("Geçilen sekmenin url: " + driver.getCurrentUrl());

        //driver.close : o sayfayı ve pencereyi kapatıyor tarayıcıyı kapatmıyor
        //driver.quit() : tarayıcıyı tamamen kapatıyor
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);



        // new window butonuna tıkla
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        List<String> newMessage = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("Kaç pencere açık: " + tabs.size());
        driver.switchTo().window(newMessage.get(1));
        System.out.println("Geçilen pencerenin url: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(newMessage.get(0));
        Thread.sleep(2000);

        //new window message butonuna tıkla
        WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
        newWindowMessageButton.click();
        List<String> newWindowMessage = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("Kaç pencere açık: " + tabs.size());
        driver.switchTo().window(newWindowMessage.get(1));
        System.out.println("Geçilen pencerenin url: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(newWindowMessage.get(0));
        Thread.sleep(2000);
        driver.quit();

    }
}
