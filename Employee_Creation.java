import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Employee_Creation {

	
	
	
	void EmployeeCreation(WebDriver driver) {
		
	//WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	EmployeeCreationVariables ec = new EmployeeCreationVariables();
	//Login Credentials

	
	//Navigation
	WebElement link_Home = driver.findElement(By.linkText("HRM"));
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Actions builder = new Actions(driver);
	// Actions builder = new Actions(driver);
	org.openqa.selenium.interactions.Action mouseOverHome = builder
			.moveToElement(link_Home)
			.moveToElement(driver.findElement(By.xpath(ec.EmpInfo)))
            .pause(500)
            .click()
            .build();
	
	mouseOverHome.perform();
	
	driver.findElement(By.id(ec.EmpAdd)).click();
	
	//select 'new' 
	Select new_rejoin = new Select(driver.findElement(By.id(ec.joinStat)));
	new_rejoin.selectByIndex(0);
	
	//enter first name
	driver.findElement(By.xpath(ec.firstName)).clear();
	driver.findElement(By.xpath(ec.firstName)).sendKeys("ABCD");
	
	//Enter Calendar date as 'DOB'
	driver.findElement(By.xpath(ec.dob)).sendKeys("01/10/2018");
	
	//select gender as 'male' 
	Select gender = new Select(driver.findElement(By.xpath(ec.gender)));
	gender.selectByIndex(1);
	
	//Enter CNIC 
	driver.findElement(By.xpath(ec.cnic)).clear();
	driver.findElement(By.xpath(ec.cnic)).sendKeys("1236467890123");
	
	//Enter calendar date as cnic_Expiry
	driver.findElement(By.xpath(ec.exNic)).sendKeys("01/10/2022");
	
	//Select role type 
	Select Role_Type = new Select
	(driver.findElement(By.id(ec.roleType)));
	Role_Type.selectByIndex(2);
			
	//Enter login ID 
	driver.findElement(By.xpath(ec.logDir)).clear();
	driver.findElement(By.xpath(ec.logDir)).sendKeys("abcd.efgh2");
	
	//click 'save' button 
	driver.findElement(By.xpath(ec.save)).click();
	
	/*String empCode = driver.findElement(By.xpath(ec.EmpCode)).getText();
	System.out.println(empCode);*/
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//to Active the employee, employment tab is needed to be filled. 
	
	
	
	}
	
}
