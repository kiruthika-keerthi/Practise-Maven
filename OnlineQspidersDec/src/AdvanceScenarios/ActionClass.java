package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	/*	driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement twoWheel = driver.findElement(By.xpath("//div[text()='Two Wheelers']"));
		
		//Action class
		Actions act=new Actions(driver);
		act.contextClick(twoWheel).perform();
		//act.moveToElement(twoWheel).perform();*/
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Actions act=new Actions(driver);
act.doubleClick(doubleclick).perform();
//act.doubleClick(doubleclick).perform();
	
	
	}

}
