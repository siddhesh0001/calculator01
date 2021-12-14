package Calculator;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Multliplication {
	 ChromeDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(2) > span.scinm:nth-child(1)").click();
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(3) > span.scinm:nth-child(2)").click();
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(3) > span.scinm:nth-child(3)").click();
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(3) > span.sciop:nth-child(4)").click();
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(2) > span.scinm:nth-child(2)").click();
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(3) > span.scinm:nth-child(2)").click();
	  driver.findElementByCssSelector("tr:nth-child(2) td:nth-child(2) div:nth-child(1) div:nth-child(2) > span.scinm:nth-child(2)").click();

	  Thread.sleep(50000);

  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "D:\\java core sid\\chromedriver.exe");
		driver= new ChromeDriver();
		 driver.get("https://www.calculator.net/");
  }

  @AfterSuite
  public void afterSuite() {
  }

}