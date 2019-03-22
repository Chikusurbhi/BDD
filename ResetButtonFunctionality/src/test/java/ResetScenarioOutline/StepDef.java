package ResetScenarioOutline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
   WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("C:\\BDD\\chrome\\WorkingWithForms.html");
			   
	}

	@When("^enter the Username  \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtUserName")).sendKeys(arg1);
		    Thread.sleep(1000);
		    driver.findElement(By.name("txtPwd")).sendKeys(arg2);
		      Thread.sleep(1000);
		      
	  // throw new PendingException();
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("reset")).click();
		
	  //throw new PendingException();
}}
