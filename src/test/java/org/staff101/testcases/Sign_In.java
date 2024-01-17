package org.staff101.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.staff101.utilities.Utilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sign_In extends Baseclass{

	By bySI = By.xpath("//nav[@id='staffheader']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]");
	By byCT = By.xpath("//div[@id='signin']/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]");
	By byEE = By.xpath("//form[@id='login']/div[1]/input[@name='login_email']");
	By byEP = By.xpath("//form[@id='login']/div[2]/input[@name='login_password']");
	By byLB = By.xpath("//button[@id='login-submit']");

	@Test(groups = {"AllTest","Sign_In"})
	public void Sign_In_Candidate ()
	{
		Reporter.log("Clicking on Sign In", true);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySI));
		driver.findElement(bySI).click();
		
		Utilities.hardWait(5);
		
		//Candidate
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCT));
		driver.findElement(byCT).click();
		
		Utilities.hardWait(3);
		
		//Email
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEE));
		driver.findElement(byEE).sendKeys("pradnyapandit4@gmail.com");
		
		Utilities.hardWait(3);
		
		//Password
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEP));
		driver.findElement(byEP).sendKeys("Pandit@515");
		
		Utilities.hardWait(3);
		
		//Login
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLB));
		driver.findElement(byLB).click();
		
		Utilities.hardWait(5);
		
	}
	
}
