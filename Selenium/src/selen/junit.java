package selen;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit {
	static WebDriver driver;

	@BeforeClass

	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void test1() {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("hello");
		//Assert.assertTrue(driver.getTitle().contains("Signup"));
		//Assert.assertEquals("hello", txtusername.getAttribute("value"));

	}

	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass
	public static void afterclass() {
		driver.quit();

	}

}
