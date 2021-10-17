package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.DublicateCategoryPage;
import basePage.ValidationMonthPage;
import util.BrowserInit;

public class ValidationMonthTest {
	WebDriver driver;

	@Test
	public void UserShouldAbleToSellAllMonthFromDropdown() {
		driver = BrowserInit.init();

		ValidationMonthPage validationMonthPage = PageFactory.initElements(driver, ValidationMonthPage.class);
		validationMonthPage.click_on_country_dropdown();
		BrowserInit.tearDown();
	}

}
