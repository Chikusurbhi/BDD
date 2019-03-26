package WorkingWithForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.LoginPageFactory;
import pageBean.WorkingwithFormsPageFactory;

public class StepDef 
{
	private WebDriver driver;
	private  WorkingwithFormsPageFactory form;
	
	@Given("^User is on form page$")
	public void user_is_on_form_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\BDD\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		form= new WorkingwithFormsPageFactory(driver);
		driver.get("file:///C:/BDD/WorkingwithForms.html");
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		String title=driver.getTitle();
		if(title.contentEquals("Email Registration Form")) System.out.println("****** Title Matched");
		else System.out.println("****** Title NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
	   form.setPfUname("surbhi");
	   Thread.sleep(1000);
	   form.setPfPwd("1234");
	   Thread.sleep(1000);
	   form.setPfConfPwd("1234");
	   Thread.sleep(1000);
	   form.setPfFname("Surbhi");
	   Thread.sleep(1000);
	   form.setPfLname("Gupta");
	   Thread.sleep(1000);
	   form.setPfGender("Female");
	   Thread.sleep(1000);
	   form.setPfDob("06/22/1997");
	   Thread.sleep(1000);
	   form.setPfEmail("ss.sw@gmail.com");
	   Thread.sleep(1000);
	   form.setPfAddress("Talwade");
	   Thread.sleep(1000);
	   form.setPfCity("Pune");
	   Thread.sleep(1000);
	   form.setPfPhone("9897035958");
	   Thread.sleep(1000);
	   form.setPfHobbies("Music");
	   Thread.sleep(1000);
	   form.setPfHobbies("Reading");
	   Thread.sleep(1000);
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
	    form.setPfButton();
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	    System.out.println("******" + alertMessage);
	    driver.close();
	}

	@When("^user leaves UserName blank$")
	public void user_leaves_UserName_blank() throws Throwable {
		form.setPfUname("");
		   Thread.sleep(1000);
	}

	@When("^user leaves Password blank$")
	public void user_leaves_Password_blank() throws Throwable {
		form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("");
		   Thread.sleep(1000);
	}

	@When("^user leaves ConfirmPassword blank$")
	public void user_leaves_ConfirmPassword_blank() throws Throwable {
		 form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("");
		   Thread.sleep(1000);
	}

	@When("^user enters different Password and ConfirmPassword$")
	public void user_enters_different_Password_and_ConfirmPassword() throws Throwable {
		 form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("324");
		   Thread.sleep(1000);
	}

	@When("^user leaves FirstName blank$")
	public void user_leaves_FirstName_blank() throws Throwable {
		 form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("");
		   Thread.sleep(1000);	}

	@When("^user leaves LastName blank$")
	public void user_leaves_LastName_blank() throws Throwable {
		form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("");
		   Thread.sleep(1000);
	}

	@When("^user does not select gender$")
	public void user_does_not_select_gender() throws Throwable {
		form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("");
		   Thread.sleep(1000);
	}

	@When("^user leaves DateofBirth blank$")
	public void user_leaves_DateofBirth_blank() throws Throwable {
		  form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("Female");
		   Thread.sleep(1000);
		   form.setPfDob("06/22/1997");
		   Thread.sleep(1000);
	}

	@When("^user leaves Email blank$")
	public void user_leaves_Email_blank() throws Throwable {
		 form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("Female");
		   Thread.sleep(1000);
		   form.setPfDob("06/22/1997");
		   Thread.sleep(1000);
		   form.setPfEmail("");
	}

	@When("^user leaves Address blank$")
	public void user_leaves_Address_blank() throws Throwable {
		 form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("Female");
		   Thread.sleep(1000);
		   form.setPfDob("06/22/1997");
		   Thread.sleep(1000);
		   form.setPfEmail("ss.sw@gmail.com");
		   Thread.sleep(1000);
		   form.setPfAddress("");
		   Thread.sleep(1000);
	}
	
	@When("^user leaves City blank$")
	public void user_leaves_City_blank() throws Throwable {
		form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("Female");
		   Thread.sleep(1000);
		   form.setPfDob("06/22/1997");
		   Thread.sleep(1000);
		   form.setPfEmail("ss.sw@gmail.com");
		   Thread.sleep(1000);
		   form.setPfAddress("Talwade");
		   Thread.sleep(1000);
		   form.setPfCity("");
		   Thread.sleep(1000);
	}

	@When("^user leaves Phone blank$")
	public void user_leaves_Phone_blank() throws Throwable {
		form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("Female");
		   Thread.sleep(1000);
		   form.setPfDob("06/22/1997");
		   Thread.sleep(1000);
		   form.setPfEmail("ss.sw@gmail.com");
		   Thread.sleep(1000);
		   form.setPfAddress("Talwade");
		   Thread.sleep(1000);
		   form.setPfCity("Pune");
		   Thread.sleep(1000);
		   form.setPfPhone("");
		   Thread.sleep(1000);
	}

	@When("^user does not select hobbies$")
	public void user_does_not_select_hobbies() throws Throwable {
		form.setPfUname("surbhi");
		   Thread.sleep(1000);
		   form.setPfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfConfPwd("1234");
		   Thread.sleep(1000);
		   form.setPfFname("Surbhi");
		   Thread.sleep(1000);
		   form.setPfLname("Gupta");
		   Thread.sleep(1000);
		   form.setPfGender("Female");
		   Thread.sleep(1000);
		   form.setPfDob("06/22/1997");
		   Thread.sleep(1000);
		   form.setPfEmail("ss.sw@gmail.com");
		   Thread.sleep(1000);
		   form.setPfAddress("Talwade");
		   Thread.sleep(1000);
		   form.setPfCity("Pune");
		   Thread.sleep(1000);
		   form.setPfPhone("9897035958");
		   Thread.sleep(1000);
		   form.setPfHobbies("");
		   Thread.sleep(1000);
		  
	}



}
