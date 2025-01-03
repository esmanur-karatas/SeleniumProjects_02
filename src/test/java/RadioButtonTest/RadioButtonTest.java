package RadioButtonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/radio-button adresine git
        String url = "https://demoqa.com/radio-button";
        driver.get(url);

        //title ın Do you like the site? bu olup olmadığını test et
        WebElement expectedText = driver.findElement(By.xpath("//*[@class=\"mb-3\"]"));
        String actualText = expectedText.getText();
        if(expectedText.getText().equals(actualText)) {
            System.out.println("Başlık : " + expectedText.getText() + "\nBaşlık testi doğru");
        }else {
            System.out.println("Başlık yanlış");
        }

        //eğer yes butonu şeçili değilse seç
        WebElement radioButton = driver.findElement(By.xpath("(//*[@class=\"custom-control-label\"])[1]"));
        if(!radioButton.isSelected()) {
            radioButton.click();
            System.out.println("Yes butonu seçildi");
        }else {
            System.out.println("Test Failed!");
        }
        Thread.sleep(2000);

        //altta çıkan yazıyı yazdır
        WebElement actualText2 = driver.findElement(By.xpath("//*[@class=\"mt-3\"]"));
        System.out.println(actualText2.getText());
        //tarayıcıdan çıkış yap
        driver.quit();
    }
}
