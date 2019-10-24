// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class ContactTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testfallKontakt() {
        driver.get("http://testarwordpress.local/");
        driver.manage().window().setSize(new Dimension(1259, 728));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#menu-item-3383 > a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("contact-3361-18-0-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            WebElement element2 = driver.findElement(By.id("contact-3361-18-0-0-contact-name"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("contact-3361-18-0-0-contact-name")).sendKeys("George Sydby");
        driver.findElement(By.id("contact-3361-18-0-0-contact-email")).sendKeys("george.sydby@gmail.com");
        driver.findElement(By.cssSelector(".builder-contact-field-email > .control-input")).click();
        driver.findElement(By.cssSelector(".builder-contact-field-email")).click();
        driver.findElement(By.cssSelector(".builder-contact-field-subject > .control-input")).click();
        driver.findElement(By.id("contact-3361-18-0-0-contact-subject")).click();
        driver.findElement(By.id("contact-3361-18-0-0-contact-subject")).sendKeys("Test Sve");
        driver.findElement(By.id("contact-3361-18-0-0-contact-message")).click();
        driver.findElement(By.id("contact-3361-18-0-0-contact-message")).sendKeys("Morötter");
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }
}
