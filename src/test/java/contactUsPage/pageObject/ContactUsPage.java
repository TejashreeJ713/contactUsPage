package contactUsPage.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsPage {
	WebDriver ldriver;
	public ContactUsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@name='email']")
	WebElement eMail;
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement comments;
	@FindBy(xpath = "//input[@type='reset']")
	WebElement reset;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;
	@FindAll(value = { @FindBy(xpath = "//*[@class='feedback-input']") })
	public List<WebElement> resetElements;
	public void enterFirstName(String nameF) {
		firstName.sendKeys(nameF);
	}
	public void enterLastName(String nameL) {
		lastName.sendKeys(nameL);
	}
	public void enterEMail(String email) {
		eMail.sendKeys(email);
	}
	public void enterComments(String cmnt) {
		comments.sendKeys(cmnt);
	}
	public void clickReset() {
		reset.click();
	}
	public void clickSubmit() {
		Submit.click();
	}
	public void validateEmptyForm() {
		String resetFName = firstName.getText();
		System.out.println(resetFName);
		String resetLName = lastName.getText();
		System.out.println(resetLName);
		String resetEmail = eMail.getText();
		System.out.println(resetEmail);
		String resetCmmnts = comments.getText();
		System.out.println(resetCmmnts);
		if (resetFName == "" && resetLName == "" && resetEmail == "" && resetCmmnts == "") {
			Assert.assertTrue(true, "Form has been successfully reset");
		} else {
			Assert.assertTrue(false, "Form failed to successfully reset");
		}
	}
	public void validateFormSubmission(String msg) {
		if(msg.contains("Thank")) {
			Assert.assertTrue(true);
			System.out.println("Page successfully submitted");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Page failed to submit");
		}
	}
}
