package BusinessComponents;

import org.openqa.selenium.By;

import GenericCompoents.BaseClass;

public class HomePage extends BaseClass {

	By Hmepagebtn = By.xpath("//button[text()='Home']");
	By HomepageNavigation = By.xpath("(//a[text()='Courses'])[1]");
	By Courseslink=By.xpath("(//a[text()='Courses'])[1]");
	By FindProduct=By.xpath("//*[@id='search-courses']");
	By SearchCourse=By.xpath("//*[@id='search-course-button']");
	By SeleniumCourse=By.xpath("//*[@title='Test Automation Robot Framework with Python - Selenium Tests']");
	

	public void HomePageValidation() {

		driver.findElement(Hmepagebtn).click();

		if (driver.findElement(HomepageNavigation).isDisplayed()) {
			System.out.println("PASSED");
		} else {
			System.out.println("Filed");
		}
	}
	
	public void Courses() {
		
		driver.findElement(Courseslink).click();
		String ExpURL="https://courses.rahulshettyacademy.com/courses";
		String ActURL = driver.getCurrentUrl();
		if(ActURL.equalsIgnoreCase(ExpURL)) {
			System.out.println("Page navigated to Courses");
		}
		else {
			System.out.println("Navigation Failed");
		}
		
		driver.findElement(FindProduct).sendKeys("Selenium");
		driver.findElement(SearchCourse).click();
		if(driver.findElement(SeleniumCourse).isDisplayed()) {
			System.out.println("Search completed succesfully");
		}
		else {
			System.out.println("Search Failed");
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
