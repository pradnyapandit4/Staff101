package org.staff101.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.staff101.utilities.Utilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Packages extends Baseclass {

	By byAUS = By.xpath("//a[contains(text(),'Abouts Us')]");
	By byBTT = By.xpath("//div[6]/div[1]/div[1]/a[1]/div[2]/i[1]");
	
	@Test(groups = {"AllTest","Packages"})
	public void Packages_Module()
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
	
}
