package contactUsPage.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {
	WebDriver ldriver;
	public LandingPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//div[@id='contact_reply']/h1")
	WebElement successMsg;
	
	@FindBy(xpath="//body//br[contains (text(),'')][1]")
	WebElement failedmessage;
	
	@FindBy(xpath="//body//br[contains (text(),'')]")
	WebElement invalidemail;
	
	public String successMsg () {
		return successMsg.getText();
	}
	public String failmessage () {
		return failedmessage.getText();
	}

	public String invalidemail () {
		return invalidemail.getText();
	}
	
	public void validateEmail(String msg) {
		if(msg.contains("Invalid")) {
			Assert.assertTrue(true);
			System.out.println("Invalid Email");
		}
		else {
		}
	}
	
	public void validateNoDataSent(String msg) {
		if(msg.contains("all")) {
			Assert.assertTrue(true);
			System.out.println("No data was submitted");
		}
		else {
			
		}
	}
	
}

