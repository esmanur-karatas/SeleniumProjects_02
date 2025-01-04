package AccordionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AccordionTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/accordian adresine git
        String url = "https://demoqa.com/accordian";
        driver.get(url);

        //birinci acordiona tıkla ve başlığı al sonra da içindeki metni al
        WebElement accordion1 = driver.findElement(By.id("section1Heading"));
        accordion1.click();
        System.out.println(accordion1.getText());
        WebElement accordion1Text = driver.findElement(By.cssSelector("div#section1Content p"));
        System.out.println(accordion1Text.getText());

        //ikinci acordiona tıkla ve başlığı al sonra da içindeki metni al
        WebElement accordion2 = driver.findElement(By.id("section2Heading"));
        accordion2.click();
        System.out.println(accordion2.getText());
        WebElement accordion2Text = driver.findElement(By.cssSelector("div#section2Content p"));
        System.out.println(accordion2Text.getText());

        //üçüncü acordiona tıkla ve başlığı al sonra da içindeki metni al
        WebElement accordion3 = driver.findElement(By.id("section3Heading"));
        accordion3.click();
        System.out.println(accordion3.getText());
        WebElement accordion3Text = driver.findElement(By.cssSelector("div#section3Content p"));
        System.out.println(accordion3Text.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
