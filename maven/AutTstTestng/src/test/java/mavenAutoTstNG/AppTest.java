package mavenAutoTstNG;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest{
 	package assesment.autoAssement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class UsingTestNG {
	WebDriver driver;
	
	@BeforeMethod
	private void setupBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.automationanywhere.com/");
		try {
			Thread.sleep(500);
			WebElement cookiebtn = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
			cookiebtn.click();
			Thread.sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	private void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}
	
	@Test(enabled = true,timeOut = 1000,priority = 1)
	private void checkLogo() {
		// TODO Auto-generated method stub
		WebElement logo = driver.findElement(By.xpath("//a[@class='coh-link header-logo']/img"));
		boolean islogoVisible = logo.isDisplayed();
		
		WebElement demoBtn = driver.findElement(By.xpath("//a[@class='coh-link utility-nav-link coh-style-solid-orange-button']"));
		boolean isdemoBtnVisible = demoBtn.isDisplayed();
		
		System.out.println("Logo is displaying: "+islogoVisible);
		Assert.assertEquals(true, islogoVisible);
		
		System.out.println("Logo is displaying: "+islogoVisible);
		Assert.assertEquals(true, isdemoBtnVisible);
	}
	
	@Test(enabled = true,timeOut = 6000,priority = 2)
	private void clickProduct() {
		// TODO Auto-generated method stub
String homePageListXpat ="//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li/";
		
		WebElement product = driver.findElement(By.xpath(homePageListXpat+"/a[contains(text(),'Product')]"));
		boolean isproductVisible = product.isDisplayed();
		product.click();
		try {
			Thread.sleep(1000);
		
		String productURL = driver.getCurrentUrl();
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement solutions = driver.findElement(By.xpath(homePageListXpat+"/a[contains(text(),'Solutions')]"));
		boolean isSolutionsVisible = solutions.isDisplayed();
		solutions.click();
		Thread.sleep(1000);
		String solutionsURL = driver.getCurrentUrl();
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement resources = driver.findElement(By.xpath(homePageListXpat+"/a[contains(text(),'Resources')]"));
		boolean isresourcesVisible = resources.isDisplayed();
		resources.click();
		Thread.sleep(1000);
		String resourcesURL = driver.getCurrentUrl();
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement beyondRPA = driver.findElement(By.xpath(homePageListXpat+"/a[contains(text(),'Beyond RPA')]"));
		boolean isbeyondRPAVisible = beyondRPA.isDisplayed();
		beyondRPA.click();
		Thread.sleep(1000);
		String beyondRPAURL = driver.getCurrentUrl();
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement company = driver.findElement(By.xpath(homePageListXpat+"/a[contains(text(),'Company')]"));
		boolean iscompanyVisible = company.isDisplayed();
		company.click();
		Thread.sleep(1000);
		String companyURL = driver.getCurrentUrl();
		driver.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Logo is displaying: "+productURL);
		Assert.assertEquals("https://www.automationanywhere.com/products", productURL);
		
		System.out.println("Logo is displaying: "+solutionsURL);
		Assert.assertEquals("https://www.automationanywhere.com/solutions", solutionsURL);
		
		System.out.println("Logo is displaying: "+resourcesURL);
		Assert.assertEquals("https://www.automationanywhere.com/resources", resourcesURL);
		
		System.out.println("Logo is displaying: "+beyondRPAURL);
		Assert.assertEquals("https://www.automationanywhere.com/rpa/robotic-process-automation", beyondRPAURL);
		
		System.out.println("Logo is displaying: "+companyURL);
		Assert.assertEquals("https://www.automationanywhere.com/company/about-us", companyURL);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

}
