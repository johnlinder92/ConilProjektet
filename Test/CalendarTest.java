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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @Test
    public void calendarTest() {
        driver.get("https://dev.conil.se/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1259, 728));


            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            WebElement element2 = driver.findElement(By.id("booking_form_div1"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);

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
        WebElement element6= driver.findElement(By.id("bklnk1"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element6);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("22")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                WebElement element5= driver.findElement(By.id("bklnk1"));
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element5);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.findElement(By.tagName("button")).click();
                driver.findElement(By.tagName("button")).click();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

               WebElement scrolla = driver.findElement(By.id("bklnk1"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrolla);





        driver.get("https://dev.conil.se/wp-login.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".login")).click();
        WebElement elementos = driver.findElement(By.id("user_login"));
        driver.findElement(By.cssSelector(".login")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        elementos.sendKeys("admin");
        driver.findElement(By.cssSelector(".login")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("user_pass")).sendKeys("password");

        driver.findElement(By.id("wp-submit")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Bokningskalender 2")).click();
        driver.findElement(By.cssSelector(".glyphicon-align-justify")).click();
        driver.findElement(By.cssSelector(".col-xs-4 .wpbc-no-margin > .wpbc-no-margin")).click();
        driver.findElement(By.cssSelector(".nav-tab:nth-child(2) > .nav-tab-text")).click();
        driver.findElement(By.cssSelector(".input-group-btn:nth-child(3) .in-button-text")).click();
        assertThat(driver.switchTo().alert().getText(), is("Vill du verkligen radera valda bokningar?"));
        driver.switchTo().alert().accept();






    }
}