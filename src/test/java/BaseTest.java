import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import java.time.Duration;

public class BaseTest {
    static WebDriver driver;
    @BeforeAll
    public static void setUp()
    {
       System.setProperty("webdriver.opera.driver","C:/Users/Public/operadriver_win64/operadriver.exe");
       driver=new OperaDriver();
        driver.get("https://10fastfingers.com/typing-test/english");
        driver.manage().window().maximize();
        WebElement cookieDenyButton=driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline']"));
        cookieDenyButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }
}
