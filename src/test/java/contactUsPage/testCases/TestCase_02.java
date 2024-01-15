package contactUsPage.testCases;

import org.testng.annotations.Test;

import contactUsPage.pageObject.BaseClass;
import contactUsPage.pageObject.ContactUsPage;


//Test to RESET already filled form
public class TestCase_02 extends BaseClass {
	@Test(priority=2)
	public void formReset() {
		driver.get(baseURL);
		ContactUsPage cU = new ContactUsPage(driver);
		cU.enterFirstName(nameF);
		cU.enterLastName(nameL);
		cU.enterEMail(email);
		cU.enterComments(cmnt);
		cU.clickReset();
		cU.validateEmptyForm();
	}
}
