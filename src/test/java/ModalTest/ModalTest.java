package ModalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ModalTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //https://demoqa.com/modal-dialogs sayfasına git
        String url = "https://demoqa.com/modal-dialogs";
        driver.get(url);

        //small modal a tıkla metni al kapat
        WebElement smallModal = driver.findElement(By.id("showSmallModal"));
        smallModal.click();
        WebElement smallModalText = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(smallModalText.getText());
        WebElement smallModalClose = driver.findElement(By.id("closeSmallModal"));
        smallModalClose.click();

        //büyük modal a tıkla metni al kapat
        WebElement largeModal = driver.findElement(By.id("showLargeModal"));
        largeModal.click();
        WebElement largeModalText = driver.findElement(By.cssSelector("div.modal-body p"));
        System.out.println(largeModalText.getText());
        WebElement largeModalClose = driver.findElement(By.id("closeLargeModal"));
        largeModalClose.click();
        //driverı kapat
        driver.quit();
    }
}
