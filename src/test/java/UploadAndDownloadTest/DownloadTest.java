package UploadAndDownloadTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class DownloadTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/upload-download adresine git
        String url = "https://demoqa.com/upload-download";
        driver.get(url);
        Thread.sleep(2000);

        //download butonuna tıklayın dosyasını indirin
        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();
        Thread.sleep(2000);

        // dosyanın indirildiğiniz kontrol edin
        // C:\Users\Huawei\Downloads\Prakash_Reddy_Resume.pdf
        String filePath = System.getProperty("user.home") + "\\Downloads\\sampleFile.jpeg";
        Boolean result = Files.exists(Paths.get(filePath));
        if (result) {
            System.out.println("sampleFile.jpeg dosyası bulundu");
        }else {
            System.out.println("sampleFile.jpeg dosyası bulunamadı.");
        }

        //Browser'ı kapatın
        Thread.sleep(2000);
        driver.quit();
    }
}
