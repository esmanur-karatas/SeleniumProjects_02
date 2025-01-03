package ChecboxTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChecboxTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/checkbox adresine git
        String url = "https://demoqa.com/checkbox";
        driver.get(url);

        //eğer checbox seçili değilse seç seçtikten sonra da test başarılı yazdır
        WebElement checbox = driver.findElement(By.xpath("//*[@class=\"rct-checkbox\"]"));
        if(!checbox.isSelected()) {
            checbox.click();
            System.out.println("Test başarılı");
        }else {
            System.out.println("checbox seçili");
        }
        //driverı kapat
        Thread.sleep(2000);
        driver.quit();
    }
}
