package contactUsPage.pageObject;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;

import net.datafaker.Faker;

public class BaseClass {
//	public 	ExtentReports extent;
	Faker data = new Faker();//object created
	public String baseURL = "https://webdriveruniversity.com/Contact-Us/contactus.html";
	public String nameF = data.name().firstName();//variable declared
	public String nameL = data.name().lastName();
	public String email = data.internet().emailAddress();
	public String invalidEMail = data.name().malefirstName()+data.name().lastName()+".com";
	public String cmnt = "Test Comment on"+LocalDateTime.now();
	public static WebDriver driver;	
	
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver =new ChromeDriver();	
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@AfterMethod
	public void teardownInitial () {
		driver.quit();
	}
	
	@AfterClass
	public void tearDown() {
//		extent.flush();
		driver.close();
	}
}
