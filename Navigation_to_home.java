import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Navigation_to_home {
	
	Set_up_Properties sp = new Set_up_Properties();
	
	
	
void LoginCred(WebDriver driver) {
	
	
	
	//Login Credentials
	driver.findElement(By.id(sp.LoginID)).sendKeys("waqas");
	driver.findElement(By.id(sp.Password)).sendKeys("abcd@1234");
	driver.findElement(By.id(sp.SubmitBtn)).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
void NavigateHome(WebDriver driver) {
		

	WebElement Main_Menu = driver.findElement(By.xpath(sp.main));
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Actions builder = new Actions(driver);
	// Actions builder = new Actions(driver);
	org.openqa.selenium.interactions.Action mouseOverHome = builder
			.moveToElement(Main_Menu)
			.click()
			.moveToElement(driver.findElement(By.xpath(sp.home)))
            .pause(500)
            .click()
            .build();
	
	mouseOverHome.perform();
	
	
}

}
