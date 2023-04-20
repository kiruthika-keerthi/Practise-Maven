package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {

	@Test
	public void CssSelectorTest()  throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.xpath("//input[@id=\"username\" or @class=\"textField\"]")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type=\"password\" or  @name=\"pwd\"]")).sendKeys("manager");
//		 driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
//		 driver.findElement(By.name("pwd")).sendKeys("manager");
//		 driver.findElement(By.id("loginButton")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		 
		 //cssSelector using id
		 //[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		 
		 //shortcut
		// driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		 
         //htmltag[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		// driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	
		 //cssSelector using class
		 //[AttributeName='AttributeValue']
         //driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		 
		 //shortcut
		// driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		 
		 
		 //htmltag[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		//driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		 
		 
	}

	
}
