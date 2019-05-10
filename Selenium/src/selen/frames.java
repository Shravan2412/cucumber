package selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bommu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame(0);
	WebElement login = driver.findElement(By.name("fldLoginUserId"));
	login.sendKeys("1234");
}
}
