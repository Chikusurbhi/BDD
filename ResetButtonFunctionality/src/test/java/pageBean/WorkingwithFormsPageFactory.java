package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkingwithFormsPageFactory {

		WebDriver driver;
		
		@FindBy(name="txtUName")
		@CacheLookup
		WebElement pfUname;
		
		@FindBy(name="txtPwd")
		@CacheLookup
		WebElement pfPwd;
		
        @FindBy(id="txtConfPassword")
		@CacheLookup
		WebElement pfConfPwd;

		@FindBy(name="txtFN")
		@CacheLookup
		WebElement pfFname;
		
		@FindBy(name="txtLN")
		@CacheLookup
		WebElement pfLname;
		
		@FindBy(name="txtPwd")
		@CacheLookup
		WebElement pfPwd;
		
		
	


	

}
