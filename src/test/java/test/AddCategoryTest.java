package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.AddCategoryPage;
import util.BrowserInit;

public class AddCategoryTest {

	WebDriver driver;

	@Test
	public void userShouldAbleToAddCategory() {
		driver = BrowserInit.init();

		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.click_on_category_botton("finalTest");
		addCategoryPage.click_on_addCategory_botton();
		// addCategoryPage.List_of_all_category();
		BrowserInit.tearDown();

	}
}
