package DataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("C:\\BDD\\chrome\\WorkingWithForms.html");
		
	   // throw new PendingException();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password(DataTable arg1) throws Throwable {
	    List<List<String>> data=arg1.raw();
	    for(int i=0;i<data.size();i++) {
		  driver.findElement(By.id("txtUserName")).clear();
	      driver.findElement(By.name("txtPwd")).clear();
	      driver.findElement(By.id("txtUserName")).sendKeys(data.get(i).get(0));
	      driver.findElement(By.name("txtPwd")).sendKeys(data.get(i).get(1));
	    
		//throw new PendingException();
	    }}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("reset")).click();
	   // throw new PendingException();
	}


}
