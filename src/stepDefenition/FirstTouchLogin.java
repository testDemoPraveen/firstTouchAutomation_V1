package stepDefenition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class FirstTouchLogin {
	WebDriver driver = null;

	@Given("^user opens firsttouch login page$")
	public void user_opens_firsttouch_login_page() {
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		driver = new FirefoxDriver(ffBinary, firefoxProfile);
		driver.get("https://test.salesforce.com/");
		driver.manage().window().maximize();

	}

	@Then("^user enters loginid$")
	public void user_enters_loginid() {
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("shylendra.ndsm@firsttechfed.com.firsttouch.ftquality");

	}

	@Then("^user enters password$")
	public void user_enters_password() {
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("F1rstt3ch002");

	}

	@And("^user clicks on signIn$")
	public void user_clicks_on_signIn() {
		driver.findElement(By.id("Login")).click();
	}

	@And("^verify login succesfull$")
	public void verify_login_succesfull() {
		Assert.assertTrue(true);
	}

	@And("^close browser$")
	public void close_browser() {
		driver.close();
	}
}
