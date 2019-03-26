package pageBean;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
		
		@FindBy(how=How.NAME, using="gender")
		@CacheLookup
		List<WebElement> pfGender;
		
		@FindBy(how=How.ID, using="DOB")
		@CacheLookup
		WebElement pfDob;
		
		@FindBy(xpath="//*[@id='txtEmail']")
		@CacheLookup
		WebElement pfEmail;
		
		@FindBy(how=How.ID,using="txtAddress")
		@CacheLookup
		WebElement pfAddress;
		
		@FindBy(how=How.NAME,using="City")
		@CacheLookup
		WebElement pfCity;
		
		@FindBy(how=How.ID,using="txtPhone")
		@CacheLookup
		WebElement pfPhone;
		
		@FindBy(how=How.NAME,using="chkHobbies")
		@CacheLookup
		List<WebElement> pfHobbies;
		
		@FindBy(xpath="html/body/form/table/tbody/tr[13]/td/input")
		@CacheLookup
		WebElement pfButton;

		public WorkingwithFormsPageFactory(WebDriver driver) {
			super();
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}

		
		public WebElement getPfUname() {
			return pfUname;
		}
		
		//setters
		public void setPfUname(String sUname) {
			pfUname.sendKeys(sUname);
		}

		public WebElement getPfPwd() {
			return pfPwd;
		}

		public void setPfPwd(String sPwd) {
			pfPwd.sendKeys(sPwd);
		}

		public WebElement getPfConfPwd() {
			return pfConfPwd;
		}

		public void setPfConfPwd(String sConfPwd) {
			pfConfPwd.sendKeys(sConfPwd);
		}

		public WebElement getPfFname() {
			return pfFname;
		}

		public void setPfFname(String sFname) {
			pfFname.sendKeys(sFname);
		}

		public WebElement getPfLname() {
			return pfLname;
		}

		public void setPfLname(String sLname) {
			 pfLname.sendKeys(sLname);
		}

		public List<WebElement> getPfGender() {
			return pfGender;
		}

		public void setPfGender(String sGender) {
			boolean flag=false;
			flag=pfGender.get(0).equals(sGender);
			if (flag==true) 
			   pfGender.get(0).click();
			else
				pfGender.get(1).click();
		}

		public WebElement getPfDob() {
			return pfDob;
		}

		public void setPfDob(String sDob) {
			pfDob.sendKeys(sDob);
		}

		public WebElement getPfEmail() {
			return pfEmail;
		}

		public void setPfEmail(String sEmail) {
			pfEmail.sendKeys(sEmail);
		}

		public WebElement getPfAddress() {
			return pfAddress;
		}

		public void setPfAddress(String sAddress) {
			pfAddress.sendKeys(sAddress);
		}

		public WebElement getPfCity() {
			return pfCity;
		}

		public void setPfCity(String sCity) {
			Select drpCity=new Select(pfCity);
			drpCity.selectByVisibleText(sCity);
			
		}

		public WebElement getPfPhone() {
			return pfPhone;
		}

		public void setPfPhone(String sPhone) {
			pfPhone.sendKeys(sPhone);
		}

		

		public List<WebElement> getPfHobbies() {
			return pfHobbies;
		}


		public void setPfHobbies(String sHobbies) {
	       for(int i=0;i<pfHobbies.size();i++)
	    	   {
	    	   String str= pfHobbies.get(i).getAttribute("value");
	    	   if(str.equals(sHobbies))
	    		   pfHobbies.get(i).click();
	    	   }
	    }


		public WebElement getPfButton() {
			return pfButton;
		}

		public void setPfButton() {
			pfButton.click();
		}
		
		
		
		
		
	
	


	

}
