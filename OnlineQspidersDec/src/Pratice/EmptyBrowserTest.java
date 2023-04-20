package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmptyBrowserTest {

	@Test
	public void EmptyBrowserTest()
	{
		
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		//String Value="C:\Users\Shobha\Downloads\chromedriver_win32 (10)\\chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		
	 driver.get("https://demo.actitime.com/login.do");
	// driver.findElement(By.id("username")).sendKeys("admin");
	 
	 //cssSelector
	// driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
	 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	 
	 
	//driver.findElement(By.name("pwd")).sendKeys("manager");
	 
	 driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
	 
	 driver.findElement(By.cssSelector("[class='initial']")).click();
	// driver.findElement(By.cssSelector("div[class='initial']")).click();
//driver.findElement(By.className("initial")).click();
//Thread.sleep(1000);
////driver.findElement(By.linkText("View Time-Track")).click();
//driver.findElement(By.partialLinkText("View Time")).click();



	}

}
