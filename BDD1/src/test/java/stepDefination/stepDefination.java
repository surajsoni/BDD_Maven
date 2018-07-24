package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefination {
	WebDriver ffdriver=new FirefoxDriver();

	@Given("^Login application should be available$")
	public void login_application_should_be_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
ffdriver.get("https://opensource-demo.orangehrmlive.com/");
		
		ffdriver.manage().window().maximize();
	}

	@When("^Validate login application$")
	public void validate_login_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		//throw new PendingException();
				ffdriver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
			      ffdriver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
			      ffdriver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("suraj","suraj");
}
}
