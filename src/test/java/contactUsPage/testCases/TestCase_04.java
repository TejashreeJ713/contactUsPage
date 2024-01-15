package contactUsPage.testCases;

import org.testng.annotations.Test;

import contactUsPage.pageObject.BaseClass;
import contactUsPage.pageObject.ContactUsPage;
import contactUsPage.pageObject.LandingPage;

public class TestCase_04 extends BaseClass {
	@Test (priority=4)
	public void emptyformSubmit() {
		driver.get(baseURL);
		ContactUsPage cU = new ContactUsPage(driver);
		cU.clickSubmit();
		LandingPage lP = new LandingPage(driver);
		String msg = lP.failmessage();
;		lP.validateNoDataSent(msg);
	}
}
