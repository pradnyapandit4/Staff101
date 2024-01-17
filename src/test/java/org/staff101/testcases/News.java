package org.staff101.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.staff101.utilities.Utilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class News extends Baseclass {

	By byNM = By.xpath("//a[contains(text(),'NEWS')]");
	By byBTT = By.xpath("//div[6]/div[1]/div[1]/a[1]/div[2]/i[1]");
	
	@Test(groups = {"AllTest","News"})
	public void News_Page()
	{
		Reporter.log("Clicking on News Module", true);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byNM));
		driver.findElement(byNM).click();
		
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
