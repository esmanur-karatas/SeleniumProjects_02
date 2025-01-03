package UploadAndDownloadTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/upload-download adresine git
        String url = "https://demoqa.com/upload-download";
        driver.get(url);

        //Dosya seç butonuna basalım
        WebElement fileChoose = driver.findElement(By.id("uploadFile"));

        // yüklemek istediğiniz dosyayı seçelim
        String filePath = System.getProperty("user.home") + "\\Downloads\\sampleFile.jpeg";
        fileChoose.sendKeys(filePath);
        Thread.sleep(2000);


        //"File Uploaded!" textinin görüntülendiğini test edelim.
        WebElement text = driver.findElement(By.id("uploadedFilePath"));
        if(text.isEnabled()) {
            System.out.println("Test Passed!");
        }else {
            System.out.println("Test Failed!");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
