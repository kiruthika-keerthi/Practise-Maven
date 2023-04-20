package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginByParameter {
	@Parameters({"url","username","Password"})
@Test
	public void LoginToApp(String url,String username,String Password)
	{
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(Password);
		 driver.findElement(By.id("loginButton")).click();
	}
}
