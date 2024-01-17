package org.staff101.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.staff101.utilities.Utilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Join_Us extends Baseclass {

	By byJU = By.xpath("//li[contains(text(),'JOIN US')]");
	By byCT = By.xpath("//a[@id='candidate-tab']");
	By byEE = By.xpath("//input[@name='candidate_email']");
	By byEP = By.xpath("//input[@name='candidate_password']");
	By byMN = By.xpath("//input[@name='candidate_phone']");
	By byPSS = By.xpath("//div[@id='joinus']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/button[1]");
	By byPSSO = By.xpath("//a[@id='bs-select-1-6']");
	By byASL = By.xpath("//div[@id='joinus']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/button[1]");
	By byASLO = By.xpath("//span[@id='']");
	By byCBox = By.xpath("//body/div[@id='joinus']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/input[1]");
	By bySU = By.xpath("//button[@id='candidate_submit']");
	
	@Test
	public void join_us_form_Candidate ()
	{
		Reporter.log("Clicking on Join Us", true);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byJU));
		driver.findElement(byJU).click();
		
		Utilities.hardWait(5);
		
		//Candidate
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCT));
		driver.findElement(byCT).click();
		
		Utilities.hardWait(5);
		
		//Email
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEE));
		driver.findElement(byEE).sendKeys("pradnyapandit4@gmail.com");
		
		Utilities.hardWait(5);
		
		//Password
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEP));
		driver.findElement(byEP).sendKeys("Pandit@515");
		
		Utilities.hardWait(5);
		
		//Phone Number
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byMN));
		driver.findElement(byMN).sendKeys("8637791523");
		
		Utilities.hardWait(5);
		
		//Please Select Specialism
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPSS));
		driver.findElement(byPSS).click();
		
		Utilities.hardWait(5);
		
		//IT Contractor
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPSSO));
		driver.findElement(byPSSO).click();
		
		Utilities.hardWait(5);
		
		//Allow in search and listing
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byASL));
		driver.findElement(byASL).click();
		
		Utilities.hardWait(5);
		
		//Yes
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byASLO));
		driver.findElement(byASLO).click();
		
		Utilities.hardWait(5);
		
		//CheckBox
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCBox));
		driver.findElement(byCBox).click();
		
		Utilities.hardWait(5);
		
		//Sign Up
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySU));
		driver.findElement(bySU).click();
		
		Utilities.hardWait(5);
		
	}
	
}
