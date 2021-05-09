package PageClasses;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Description - 
	 * Module - Todos Home Page 
	 * Author - Achini_Herath
	 * Date - 8.05.2021
	 * version - 0.01
	 * @throws IOException
	 */

	// Todos header 

	@FindBy (className  = "new-todo")
	@CacheLookup
	public WebElement todosHeader;


	public String todosHeaderGetText() {
		return todosHeader.getText();


	}

	// Todos Text area  

	@FindBy (className  = "new-todo")
	@CacheLookup
	public WebElement todosAddTextArea;

	public void todosAddTextAreaClick() {
		todosAddTextArea.click();
	}

	public String todosAddTextAreaGetText() {
		return todosAddTextArea.getText();
	}

	public void setToDoItemn(String strToDoItem) {
		todosAddTextArea.sendKeys(strToDoItem);
	}

	//1st record  in the List

	@FindBy (xpath   = " /html/body/section/div/section/ul/li[1]/div/label")
	@CacheLookup
	public WebElement todosFirstRecord;

	public void todosFirstRecordClick() {
		todosFirstRecord.click();
	}

	public String todosFirstRecordGetText() {
		return todosFirstRecord.getText();
	}

	//1st List item's checkbox 
	@FindBy (xpath   = " /html/body/section/div/section/ul/li[1]/div/input")
	@CacheLookup
	public WebElement todosFirstRecordCheckbox;

	public void todosFirstRecordCheckboxClick() {
		todosFirstRecordCheckbox.click();
	}


	//1st List item's Delete Button  
	@FindBy (xpath   = "/html/body/section/div/section/ul/li[1]/div/button")
	@CacheLookup
	public WebElement todosFirstRecordDelete;

	public void todosFirstRecordDeleteClick() {
		todosFirstRecordDelete.click();
	}



	//Clear completed Button  

	@FindBy (xpath   = " /html/body/section/div/footer/button")
	@CacheLookup
	public WebElement clearCompletedButton;

	public void clearCompletedButtonClick() {
		clearCompletedButton.click();
	}

	public String clearCompletedButtonGetText() {
		return clearCompletedButton.getText();
	}


	//To do count  

	@FindBy (className = "todo-count")
	@CacheLookup
	public WebElement todoCountText;



	public String todoCountTextGetText() {
		return todoCountText.getText();
	}


	//All Button  

	@FindBy (xpath = "/html/body/section/div/footer/ul/li[1]/a")
	@CacheLookup
	public WebElement allButton;



	public String allButtonGetText() {
		return allButton.getText();
	}

	public void allButtonClick() {
		allButton.click();
	}


	//Active Button  


	@FindBy(linkText = "Active")
	@CacheLookup
	public WebElement activeButton;



	public String activeButtonGetText() {
		return activeButton.getText();
	}

	public void activeButtonClick() {
		activeButton.click();
	}
}
