package basePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ValidationMonthPage {
	WebDriver driver;

	public ValidationMonthPage(WebDriver driver) {
		this.driver = driver;

	}

	public void click_on_country_dropdown() {
		Select s = new Select(driver.findElement(By.xpath("//select[@name='due_month']")));
		List<WebElement> months = s.getOptions();
		int size = months.size();
		

	for (int i = 1; i<size; i++) {
		String allmonths = months.get(i).getText();
			System.out.println(allmonths);

		}
		
	}

}
