package contactUsPage.testCases;

import org.testng.annotations.Test;

import contactUsPage.pageObject.BaseClass;
import contactUsPage.pageObject.ContactUsPage;
import contactUsPage.pageObject.LandingPage;

public class TestCase_05 extends BaseClass {
	@Test (priority =5)
	public void failedTest() {
		driver.get(baseURL);
		ContactUsPage cU = new ContactUsPage(driver);
		cU.enterFirstName(nameF);
		cU.enterLastName(nameL);
		cU.enterEMail(invalidEMail);
		cU.enterComments(cmnt);
		cU.clickSubmit();
		LandingPage lP = new LandingPage(driver);
		String sm1 = lP.successMsg();
		cU.validateFormSubmission(sm1);
	}
}
