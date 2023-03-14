package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BusinessComponents.HomePage;
import GenericCompoents.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest extends BaseClass {
	HomePage homepage = new HomePage();

	@BeforeTest
	public void beforetest() {
		LaunchBrowser();
	}

	@Test
	public void Run() {

		homepage.HomePageValidation();
		homepage.Courses();

	}

	@AfterTest
	public void Close() {
		CloseBrowser();
	}

}
