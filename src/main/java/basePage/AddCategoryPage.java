package basePage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCategoryPage {

	WebDriver driver;

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Add_Category_Element;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement click_Add_category_Botton;
	// @FindBy(how =How.LINK_TEXT, using ="delcat.php?cid=526") WebElement
	// category_item;

	public void click_on_category_botton(String name) {
		Add_Category_Element.sendKeys(name);
	}

	public void click_on_addCategory_botton() {
		click_Add_category_Botton.click();
	}

}
