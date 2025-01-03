package MouseClickTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseClickTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://demoqa.com/buttons adresine git
        String url = "https://demoqa.com/buttons";
        driver.get(url);

        // ilk butona çift tıkla
        WebElement doubleClicButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClicButton).perform();
        Thread.sleep(2000);
        if(doubleClicButton.isEnabled()) {
            WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
            System.out.println(doubleClickMessage.getText());
        }

        //ikinci butona sağ tıkla
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();
        Thread.sleep(2000);
        if(doubleClicButton.isEnabled()) {
            WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
            System.out.println(rightClickMessage.getText());
        }

        //üçüncü butona tıkla
        //üçüncü butonun id si dinamiktir yani sayfa her yenilendiğinde id değeri değişir o yüzden xpath kullanılır yaygın olarak.
        WebElement clickButton = driver.findElement(By.xpath("(//*[@class=\"btn btn-primary\"])[3]"));
        actions.click(clickButton).perform();
        Thread.sleep(2000);
        if(doubleClicButton.isEnabled()) {
            WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
            System.out.println(dynamicClickMessage.getText());
        }
        //browserı kapat
        driver.quit();
    }
}
