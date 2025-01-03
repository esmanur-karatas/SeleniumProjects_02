package ChecboxTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChecboxTest_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/checkbox adresine git
        String url = "https://demoqa.com/checkbox";
        driver.get(url);


        // yandaki > basıp diğer şeyleri de aç
        WebElement section = driver.findElement(By.xpath("(//*[@class=\"rct-collapse rct-collapse-btn\"])[1]"));
        section.click();
        Thread.sleep(2000);

        // ve içinden şeyi seç desktop seç
        WebElement desktop = driver.findElement(By.xpath("(//*[@class=\"rct-icon rct-icon-uncheck\"])[2]"));
        if(!desktop.isSelected()) {
            desktop.click();
            System.out.println("Desktop seçildi");
        }

        Thread.sleep(3000);

        // sonrasında > işaretine bas desktop yanındaki
        WebElement optionTwo = driver.findElement(By.xpath("(//*[@class=\"rct-icon rct-icon-expand-close\"])[1]"));
        optionTwo.click();
        Thread.sleep(1000);
        // ve oradan da eğer notes seçiliyse seçimi kaldır.
        WebElement notes = driver.findElement(By.xpath("(//*[@class=\"rct-icon rct-icon-check\"])[2]"));
        if (notes.isEnabled()) {
            notes.click();
            System.out.println("Notes seçim kaldırıldı");
        }
        Thread.sleep(1000);

        // browserı kapat
        driver.quit();
    }
}
