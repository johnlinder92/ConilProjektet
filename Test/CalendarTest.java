import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CalendarTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @Test
    public void calendarTest() {
        driver.get("https://dev.conil.se/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1259, 728));

        {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            WebElement element2 = driver.findElement(By.id("booking_form_div1"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("name1")).click();
        driver.findElement(By.id("name1")).sendKeys("John Linder");
        driver.findElement(By.id("secondname1")).sendKeys("Linder");
        driver.findElement(By.id("email1")).sendKeys("john.artur.linder@gmail.com");
        driver.findElement(By.id("details1")).click();
        driver.findElement(By.id("details1")).sendKeys("hrsgfhdfghdfhfg");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement element3 = driver.findElement(By.className("module-title"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("»")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("22")).click();

    }
}