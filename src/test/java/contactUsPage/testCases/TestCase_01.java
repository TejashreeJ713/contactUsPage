package contactUsPage.testCases;

import org.testng.annotations.Test;
import contactUsPage.pageObject.BaseClass;
import contactUsPage.pageObject.ContactUsPage;
import contactUsPage.pageObject.LandingPage;


// Test to run happy path 
public class TestCase_01 extends BaseClass {
	@Test(priority=1)
	public void formSubmit() {
		driver.get(baseURL);
		ContactUsPage cU = new ContactUsPage(driver);
		cU.enterFirstName(nameF);
		cU.enterLastName(nameL);
		cU.enterEMail(email);
		cU.enterComments(cmnt);
		cU.clickSubmit();
		LandingPage lP = new LandingPage(driver);
		String sm1 = lP.successMsg();
		cU.validateFormSubmission(sm1);
	}
}
