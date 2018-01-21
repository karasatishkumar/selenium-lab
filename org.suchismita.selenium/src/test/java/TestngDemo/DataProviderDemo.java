package TestngDemo;

import junit.extensions.TestDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	/*public WebDriver driver;
	@BeforeMethod
	//launch browser
	public void launchbrowser(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	*/
	@DataProvider(name="Testdata")
	
		Object[][] getdata(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="usmane";
		data[0][1]="psw";
		
		data[1][0]="usname1";
		data[1][1]="psw1";
		
		data[2][0]="suchismita567@gmail.com";
		data[2][1]="suchi@123";
		
		return data;
	}
	@Test(dataProvider="Testdata")
	/*public void login(String username, String password){
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_0")).click();
		driver.close();
		
		
}*/
	
	public void testlogin(String name, String pass){
		System.out.println("name...........>" +name);
		System.out.println("pass...........>" + pass);
	}
	
		
	}


