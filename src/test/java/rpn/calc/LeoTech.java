package rpn.calc;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeoTech {
	private WebDriver driver;
	private String baseUrl;
	

	@Test
	public void testLeoTech() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com.sg/";
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("leo tech");
		driver.findElement(By.cssSelector("#sbse1 > div.sbqs_c > b")).click();
		driver.findElement(By.name("btnG")).click();
	}

}
