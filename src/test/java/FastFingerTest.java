import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FastFingerTest extends BaseTest {

    @Test
    public void fastFinger()
    {
        WebElement textBox=driver.findElement(By.id("inputfield"));
          for (int i=0;i<=378;i++)
          {
              WebElement word=driver.findElement(By.xpath("//div[@id='row1']//span[@wordnr="+i+"]"));
              textBox.sendKeys(word.getText()+ " ");
          }

    }
}
