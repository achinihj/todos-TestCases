package TestClasses;

import java.io.IOException;

import javax.swing.text.Element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import PageClasses.HomePage;

public class HomeTest {
	
	static WebDriver driver;
	public static String browser;


	/**
	 * Description - 
	 * Module - 
	 * Author - Achini_Herath
	 * Date - 08.05.2021
	 * version - 0.01
	 * @throws IOException
	 */
	
	
	//@BeforeTest
	public static void openBrowser() {
		setBrowser();
		setBrowserConfig();
	}

	@Test(priority=1)
	public void TodoURLPageRedirection() 
	{

		setBrowser();
		setBrowserConfig();
		setHomePage();
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(true,  currentURL.contains("todomvc.com/examples/react/#/"));
		runTests();
	}
	
	
	
	@Test(priority=1)
	public void AddTodoListItem() 
	{

		setBrowser();
		setBrowserConfig();
		setHomePage();
		HomePage hmPage = new HomePage(driver);
		hmPage.todosAddTextAreaClick();
		hmPage.setToDoItemn("List Item 001"  + "\n");
		String a = hmPage.todosFirstRecordGetText();
		Assert.assertEquals(true,  a.contains("List Item 001"));
		runTests();
	}
	
	@Test(priority=1)
	public void MarkAsCompleteListItem() 
	{

		setBrowser();
		setBrowserConfig();
		setHomePage();
		HomePage hmPage = new HomePage(driver);
		hmPage.todosAddTextAreaClick();
		hmPage.setToDoItemn("List Item 001"  + "\n");
		hmPage.todosFirstRecordCheckboxClick();
		String a = hmPage.clearCompletedButtonGetText();
		Assert.assertEquals(true,  a.contains("Clear completed"));
		runTests();
	}
	
	@Test(priority=1)
	public void AllButtonPageRedirection() 
	{

		setBrowser();
		setBrowserConfig();
		setHomePage();
		HomePage hmPage = new HomePage(driver);
		hmPage.todosAddTextAreaClick();
		hmPage.setToDoItemn("List Item 001"  + "\n");
		hmPage.todosAddTextAreaClick();
		hmPage.setToDoItemn("List Item 002"  + "\n");
		hmPage.allButtonClick();
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(true,  currentURL.contains("todomvc.com/examples/react/#/"));
		runTests();
	}
	
	@Test(priority=1)
	public void ActiveButtonGetText() 
	{

		setBrowser();
		setBrowserConfig();
		setHomePage();
		HomePage hmPage = new HomePage(driver);
		hmPage.todosAddTextAreaClick();
		hmPage.setToDoItemn("List Item 001"  + "\n");
		hmPage.todosAddTextAreaClick();
		hmPage.setToDoItemn("List Item 002"  + "\n");
		hmPage.activeButtonClick();
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(true,  currentURL.contains("examples/react/#/active"));
		runTests();
	}

	public static void setBrowser() {
		browser = PropertiesFile.getProperty("browser");
	}

	public static void setBrowserConfig() {

		// We can have all the browser settings there in side this 
		if (browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver");
			driver = new ChromeDriver();
		}

		if (browser.contains("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","firefoxdriver");
			driver = new FirefoxDriver();
		}

		if (browser.contains("safari"))
		{
			System.setProperty("webdriver.safari.driver","safaridriver");
			driver = new SafariDriver();
		}

		if (browser.contains("ie"))
		{
			System.setProperty("webdriver.InternetExplorer.driver","iedriver");
			driver = new InternetExplorerDriver();
		}
	}
	
	public static void setHomePage() {
		String ServerURL = PropertiesFile.getProperty("url");
		String FullUrl = (ServerURL );
		driver.get(FullUrl);
	}

	public static void runTests() {

		driver.close();
		driver.quit();
		
	}
}
