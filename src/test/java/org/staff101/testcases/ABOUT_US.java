package org.staff101.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.staff101.utilities.Utilities;

public class ABOUT_US extends Baseclass {

	By byAUS = By.xpath("//a[contains(text(),'Abouts Us')]");
	By byBTT = By.xpath("//div[6]/div[1]/div[1]/a[1]/div[2]/i[1]");
	By byCUS = By.xpath("//nav[@id='staffheader']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[6]/ul[1]/li[2]/a[1]");
	By byFAQS = By.xpath("//a[contains(text(),\"FAQ's\")]");
	By byTAPS = By.xpath("//a[contains(text(),'Term & Policies')]");

	@Test(groups = {"AllTest","ABOUT_US"})
	public void About_Us()
	{
		Utilities.hardWait(3);
		
		Reporter.log("Hovering on About Us", true);
		
		Actions action = new Actions(driver);
		
		WebElement abus = driver.findElement(By.xpath("//a[@id='icon']"));
		action.moveToElement(abus).build().perform();
		
		Utilities.hardWait(3);
		
		//Clicking on About Us sub-module
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byAUS));
		driver.findElement(byAUS).click();
		
		Utilities.hardWait(8);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Utilities.hardWait(4);
		
		//Back To Top
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byBTT));
		driver.findElement(byBTT).click();
		
		Utilities.hardWait(3);
		
	}

	@Test(groups = {"AllTest","ABOUT_US"})
	public void Contact_Us()
	{
		Utilities.hardWait(3);
		
		Reporter.log("Hovering on About Us", true);
		
		Actions action = new Actions(driver);
		
		WebElement abus = driver.findElement(By.xpath("//a[@id='icon']"));
		action.moveToElement(abus).build().perform();
		
		Utilities.hardWait(3);
		
		//Clicking on Contact Us sub-module
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCUS));
		driver.findElement(byCUS).click();
		
		Utilities.hardWait(8);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Utilities.hardWait(4);
		
		//Back To Top
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byBTT));
		driver.findElement(byBTT).click();
		
		Utilities.hardWait(3);
		
	}

	@Test(groups = {"AllTest","ABOUT_US"})
	public void FAQS()
	{
		Utilities.hardWait(3);
		
		Reporter.log("Hovering on About Us", true);
		
		Actions action = new Actions(driver);
		
		WebElement abus = driver.findElement(By.xpath("//a[@id='icon']"));
		action.moveToElement(abus).build().perform();
		
		Utilities.hardWait(3);
		
		//Clicking on FAQ'S sub-module
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFAQS));
		driver.findElement(byFAQS).click();
		
		Utilities.hardWait(8);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Utilities.hardWait(4);
		
		//Back To Top
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byBTT));
		driver.findElement(byBTT).click();
		
		Utilities.hardWait(3);
		
	}

	@Test(groups = {"AllTest","ABOUT_US"})
	public void Term_Policies()
	{
		Utilities.hardWait(3);
		
		Reporter.log("Hovering on About Us", true);
		
		Actions action = new Actions(driver);
		
		WebElement abus = driver.findElement(By.xpath("//a[@id='icon']"));
		action.moveToElement(abus).build().perform();
		
		Utilities.hardWait(3);
		
		//Clicking on Term & Policies sub-module
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byTAPS));
		driver.findElement(byTAPS).click();
		
		Utilities.hardWait(8);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Utilities.hardWait(4);
		
		//Back To Top
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byBTT));
		driver.findElement(byBTT).click();
		
		Utilities.hardWait(3);
		
	}
	
}
