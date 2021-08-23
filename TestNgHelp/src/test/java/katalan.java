

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class katalan {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	 WebDriverManager.chromedriver().setup(); 
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.makemytrip.com/");
    driver.findElement(By.xpath("//div[@id='SW']/div/div[2]/div/div/nav/ul/li/a/span")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/ul/li[2]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div")).click();
    driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']/div/div/p")).click();
    driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div/div/p[2]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div/div[3]/div[3]/div[6]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div/div[3]/div[4]/div[7]/div/p[2]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[5]/label/span")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[5]/div[2]/div/ul/li[2]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[5]/div[2]/div/div/div/ul/li[3]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[5]/div[2]/div/div/div[2]/ul/li[4]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div/div[5]/div[2]/div/div/div[2]/ul/li[2]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

