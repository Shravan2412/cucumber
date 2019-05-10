package selen;

import org.openqa.selenium.WebDriver;

public class login extends base{

	public static void main(String[] args) {
WebDriver driver=getDriver();
loadurl("https://www.facebook.com/");
sample s=new sample();
type(s.getTxtusername(),"hello");
type(s.getTxtpass(),"asdf");


	}

}
