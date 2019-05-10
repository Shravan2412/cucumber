package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample extends base {

public sample() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="email")
private WebElement txtusername;

@FindBy(id="pass")
private WebElement txtpass;

public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getTxtpass() {
	return txtpass;
}

	}


