package DynamicElementsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElementsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/dynamic-properties adresine git
        String url = "https://demoqa.com/dynamic-properties";
        driver.get(url);

        //Başlığı yazdır
        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);

        //5 snye bekleyip sonra butona tıklanıyor
        WebElement firstButtom = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(firstButtom));
        firstButtom.click();

        //color change buttonunun da classı değişiyor
        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before Change : " + className);

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton,"class","mt-4 text-danger btn btn-primary"));
        className = colorChangeButton.getAttribute("class");
        System.out.println("After Change: " + className);

        //
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();
        driver.quit();


    }
}
