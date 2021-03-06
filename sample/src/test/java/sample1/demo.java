package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo {
	static WebDriver driver;

	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");

	}

	@When("the user fill in the customer details")
	public void the_user_fill_in_the_customer_details() {

		driver.findElement(By.xpath("//label[@for='done']")).click();

		WebElement txtfname = driver.findElement(By.id("fname"));
		txtfname.sendKeys("hello");

		WebElement txtlname = driver.findElement(By.id("lname"));
		txtlname.sendKeys("java");

		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("hello@gmail.com");

		WebElement message = driver.findElement(By.xpath("//textarea[@id='message']"));
		message.sendKeys("202 gandhi nagar");

		WebElement txtphone = driver.findElement(By.id("telephoneno"));
		txtphone.sendKeys("1234567890");

	}

	@When("the user click on submit button")
	public void the_user_click_on_submit_button() {
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();

	}

	@Then("the user should see the customer id is generated")
	public void the_user_should_see_the_customer_id_is_generated() {
		WebElement custid = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		String name = custid.getText();
		System.out.println(name);

	}

}
