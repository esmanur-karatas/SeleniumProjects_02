package AlertTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/alerts sayfasına git
        String url = "https://demoqa.com/alerts";
        driver.get(url);

        //ilk alerta tıkla ve sonrasında çıkan kutudaki texti ve tamam butonuna basarak kabul et
        WebElement firstAlertButtonClick = driver.findElement(By.id("alertButton"));
        firstAlertButtonClick.click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Birinci alert texti: " + alertText);
        driver.switchTo().alert().accept();

        // İkinci alert butonuna tıkla
        WebElement secondAlertButtonClick = driver.findElement(By.id("timerAlertButton"));
        secondAlertButtonClick.click();
        // Alert'in görünmesini 5 saniye bekle
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        // Alert mesajını al ve konsola yazdır
        String alertText2 = driver.switchTo().alert().getText();
        System.out.println("İkinci alert texti: " + alertText2);
        // Alert'i kabul et
        driver.switchTo().alert().accept();
        System.out.println("Alert kabul edildi.");

        //üçüncü alerta tıkla ve metni al sonra tamama bas tamama basınca kabul edildi diye konsola yazdır
        // sonrasında bir daha tıkla ve bu sefer de iptale bas
        WebElement thirdAlertButtonClick = driver.findElement(By.id("confirmButton"));
        thirdAlertButtonClick.click();
        String alertText3 = driver.switchTo().alert().getText();
        System.out.println("3. alert texti: " + alertText3);
        driver.switchTo().alert().accept();
        thirdAlertButtonClick.click();
        driver.switchTo().alert().dismiss();

        //4. de de alert içine bir text gir ve tamam bas sonrada iptale bas
        WebElement fourthAlertButtonClick = driver.findElement(By.id("promtButton"));
        fourthAlertButtonClick.click();
        driver.switchTo().alert().sendKeys("Esmanur Karataş");
        driver.switchTo().alert().accept();
        String alertText4 = driver.findElement(By.id("promptResult")).getText();
        System.out.println("4. alert texti: " + alertText4);
        fourthAlertButtonClick.click();
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);
        driver.quit();

    }
}
