package contactUsPage.testCases;

import org.testng.annotations.Test;

import contactUsPage.pageObject.BaseClass;
import contactUsPage.pageObject.ContactUsPage;
import contactUsPage.pageObject.LandingPage;


//Test to submit invalid email
public class TestCase_03 extends BaseClass {

	@Test (priority=3)
	public void invalidEmail() {
		driver.get(baseURL);
		ContactUsPage cU = new ContactUsPage(driver);
		cU.enterFirstName(nameF);
		cU.enterLastName(nameL);
		cU.enterEMail(invalidEMail);
		cU.enterComments(cmnt);
		cU.clickSubmit();
		LandingPage lP = new LandingPage(driver);
		String sm3 = lP.invalidemail();
		lP.validateEmail(sm3);
	}
}
