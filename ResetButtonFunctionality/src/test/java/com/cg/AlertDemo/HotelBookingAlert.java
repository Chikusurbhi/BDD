package com.cg.AlertDemo;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HotelBookingAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("C:\\BDD\\chrome\\hotelbooking.html");
		
		 //driver.findElement(By.id("txtFirstName")).sendKeys("");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtFirstName")).sendKeys("Surbhi");
	     //driver.findElement(By.id("txtLastName")).sendKeys("");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     

	     driver.findElement(By.id("txtLastName")).sendKeys("Gupta");
	     ///driver.findElement(By.id("txtEmail")).sendKeys("");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	 
	     driver.findElement(By.id("txtEmail")).sendKeys("sg@gmail.com");
	     //driver.findElement(By.id("txtPhone")).sendKeys("");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     /*****For invalid Mobile no****/
	     driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("9454666001");
	     driver.findElement(By.id("btnPayment")).click();
	     callAlert();

	     driver.findElement(By.id("txtPhone")).sendKeys("7894561230");
	     //driver.findElement(By.id("txtPhone")).sendKeys("");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     Select drpcity=new Select(driver.findElement(By.name("city")));
	     drpcity.selectByIndex(1);
	     driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     Select drpstate=new Select(driver.findElement(By.name("state")));
	     drpcity.selectByIndex(1);
	     driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
         Select drpguests=new Select(driver.findElement(By.name("persons")));
	     drpcity.selectByIndex(1);
	     driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtCardholderName")).sendKeys("surbhi");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtDebit")).sendKeys("101010101010");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtCvv")).sendKeys("123");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtMonth")).sendKeys("12");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtYear")).sendKeys("23");
		 driver.findElement(By.id("btnPayment")).click();
		 callAlert();
	     Thread.sleep(2000);


	
	
	
	
	}

	public static void callAlert() throws InterruptedException {
		// TODO Auto-generated method stub
		Alert alertMessage=driver.switchTo().alert();
		System.out.println("Alert message is " +alertMessage.getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

}
