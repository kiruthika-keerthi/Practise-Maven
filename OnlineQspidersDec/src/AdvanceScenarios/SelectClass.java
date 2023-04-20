package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);

		WebElement daylist = driver.findElement(By.id("day"));
		
		Select sel=new Select(daylist);
		sel.selectByIndex(4);
	
		
		WebElement monthlist = driver.findElement(By.id("month"));
		
		Select sele=new Select(monthlist);
		sele.selectByValue("2");
		
		WebElement yearlist = driver.findElement(By.id("year"));
		
		Select selec=new Select(yearlist);
		selec.selectByVisibleText("2012");
	}

}
