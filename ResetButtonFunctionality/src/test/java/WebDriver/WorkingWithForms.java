package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WorkingWithForms {

	public static void main(String[] args)
	{
		//WebDriver driver=new FirefoxDriver();
		//driver.get("file://///ndafile/Shared%20Materials/GLC-G102/BDD/WorkingWithForms.html");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("C:\\BDD\\chrome\\WorkingWithForms.html");
try {
		//Find Username textbox and enter value
	    driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
	    Thread.sleep(1000);
	    
	  //Find Password textbox and enter value
      driver.findElement(By.name("txtPwd")).sendKeys("igate");
      Thread.sleep(1000);
      
    //Find Confirm Password textbox and enter value
      driver.findElement(By.className("Format")).sendKeys("igate");
      Thread.sleep(1000);
	}
catch(Exception e) {
	System.out.println("some exception");}
	//Find first name textbox and enter value
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
		
		//drpcity.selectByVisibleText("Mumvbai");
		drpcity.selectByIndex(1);
		//drpcity.selectByIndex(2);
		
		//Find Phone textbox and enter value
		//driver.findElement(By.xpath("file:///C:/BDD/chrome/WorkingWithForms.html"));
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9897035958");
		driver.findElement(By.cssSelector("input[value='Reading']")).click();
		driver.findElement(By.cssSelector("input[value='Music']")).click();
		driver.findElement(By.cssSelector("input[value='Movies']")).click();
		//List<WebElement> element=driver.findElement(By.name("chkHobbies"));
		
		driver.findElement(By.name("reset")).click();
}
}

