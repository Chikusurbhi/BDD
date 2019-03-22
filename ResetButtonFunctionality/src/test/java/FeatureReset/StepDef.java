package FeatureReset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

WebDriver driver;
@Given("^Open the firefox and launch the application$")
public void open_the_firefox_and_launch_the_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chrome\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("C:\\BDD\\chrome\\WorkingWithForms.html");
    //throw new PendingException();
}

@When("^Enter the username and password$")
public void enter_the_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
    Thread.sleep(1000);
	
	   driver.findElement(By.name("txtPwd")).sendKeys("igate");
	      Thread.sleep(1000);
	      
	    //Find Confirm Password textbox and enter value
	      driver.findElement(By.className("Format")).sendKeys("igate");
	      Thread.sleep(1000);
	      driver.findElement(By.name("txtFN")).sendKeys("Amit");
	  	
	  	//Find last name textbox and enter value
	  		driver.findElement(By.name("txtLN")).sendKeys("Pandit");
	  		
	  		//Find Gender Radio button and enter value
	  		driver.findElement(By.cssSelector("input[value='Male']")).click();
	  		
	  		//Find Date of Birth textbox and enter value
	  		driver.findElement(By.name("DtOB")).sendKeys("20/12/1983");
	  		
	  		//Find Email textbox and enter value
	  		driver.findElement(By.name("Email")).sendKeys("amit.pandit@igate.com");
	  		

	  		//Find Address textbox and enter value
	  		driver.findElement(By.name("Address")).sendKeys("Tilak Nagar");
	  		
	  		Select drpcity=new Select(driver.findElement(By.name("City")));
	      
   // throw new PendingException();
}

@Then("^Reset the credentials$")
public void reset_the_credentials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("reset")).click();
    //throw new PendingException();
}
}
