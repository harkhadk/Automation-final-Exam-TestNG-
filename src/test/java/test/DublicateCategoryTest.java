package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.DublicateCategoryPage;
import util.BrowserInit;

public class DublicateCategoryTest {

	WebDriver driver;

	@Test
	public void userShouldNotAbleToAddCategory() {
		driver = BrowserInit.init();

		DublicateCategoryPage dublicateCategoryPage = PageFactory.initElements(driver, DublicateCategoryPage.class);
		dublicateCategoryPage.click_on_category_botton("aprilqaTest");

		BrowserInit.tearDown();

	}
}