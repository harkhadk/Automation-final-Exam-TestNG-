package basePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DublicateCategoryPage {

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Add_Category_Element;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement click_Add_category_Botton;

	public void click_on_category_botton(String name) {
		Add_Category_Element.sendKeys(name);
	}

	public void click_on_addCategory_botton() {
		click_Add_category_Botton.click();
	}
}