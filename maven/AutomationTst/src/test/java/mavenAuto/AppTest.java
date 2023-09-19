package mavenAuto;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest{
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.automationanywhere.com/");
		
		Thread.sleep(500);
		
		WebElement cookiebtn = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		cookiebtn.click();
		
		WebElement logo = driver.findElement(By.xpath("//a[@class='coh-link header-logo']/img"));
		boolean islogoVisible = logo.isDisplayed();
		
		WebElement demoBtn = driver.findElement(By.xpath("//a[@class='coh-link utility-nav-link coh-style-solid-orange-button']"));
		boolean isdemoBtnVisible = demoBtn.isDisplayed();
		
		System.out.println("Logo is displaying: "+islogoVisible);
		Assert.assertEquals(true, islogoVisible);
		
		System.out.println("Logo is displaying: "+islogoVisible);
		Assert.assertEquals(true, isdemoBtnVisible);
		
		//Question 4
		//Verify menu in home page
		String homePageListXpat ="//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li/";
		
		WebElement product = driver.findElement(By.xpath(homePageListXpat+"/a[contains(text(),'Product')]"));
		boolean isproductVisible = logo.isDisplayed();
		product.click();
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
		
		driver.close();
	}
}
