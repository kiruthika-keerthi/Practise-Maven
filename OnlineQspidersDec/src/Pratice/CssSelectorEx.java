package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
		

			driver.get("https://demo.actitime.com/login.do");
			
			//using id
		//	driver.findElement(By.id("username")).sendKeys("admin");
			
			//using class locator
			//driver.findElement(By.className("textField")).sendKeys("admin");
			
			//cssSelector
			//[AttributeName='AtributeValue']
			//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("#username")).sendKeys("admin");
			
			//htmltag[AttributeName='AttributeValue']
		//	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
			
			//class--->[AttributeName='AttributeValue']
	// driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
			driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
	 
	 //class---->htmlTag[AttributeName='AttributeValue']
	//driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
	 
	 
			
	}

}
