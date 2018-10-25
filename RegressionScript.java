
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegressionScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set_up_Properties sp = new Set_up_Properties(); 
		Employee_Creation emp = new Employee_Creation(); 
		Navigation_to_home nth = new Navigation_to_home();
	
		System.setProperty(sp.browser,sp.path);
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get(sp.site);
		
		nth.LoginCred(driver);
		emp.EmployeeCreation(driver);
		nth.NavigateHome(driver);
		
		
		

		
		
		
		
	}

}
