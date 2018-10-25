import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Leave_Application {
	
	void LeaveApplication(WebDriver driver) {
		
		
		String App = "//*[@id=\"ctl00_MenuControln128\"]/td/table/tbody/tr/td/a";
		
		WebElement link_Home = driver.findElement(By.linkText("Rosters"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions builder = new Actions(driver);
		// Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action mouseOverHome = builder
				.moveToElement(link_Home)
				.moveToElement(driver.findElement(By.xpath(App)))
	            .pause(500)
	            .click()
	            .build();
		
		mouseOverHome.perform();
		
		
		
		
		
		
	}

}
