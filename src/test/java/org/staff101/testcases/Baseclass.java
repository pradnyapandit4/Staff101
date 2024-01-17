package org.staff101.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.staff101.utilities.Utilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	@BeforeClass(groups = {"AllTest","Jobs_Module","Recruiter","Candidates","News","ABOUT_US","Sign_In","Sign_In2","Packages"})
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://staff.mydevsystems.co.uk/");
		Utilities.hardWait(3);
		
		Reporter.log("Browser session started", true);
		
	}
	
	@AfterClass(groups = {"AllTest","Jobs_Module","Recruiter","Candidates","News","ABOUT_US","Sign_In","Sign_In2","Packages"})
	public void tearDown() throws InterruptedException
	{
		Utilities.hardWait(3);
		Reporter.log("Browser session ended", true);
		driver.quit();
		
	}
	
}
