package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionWithSendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		WebElement UN = driver.findElement(By.id("username"));
		WebElement PW = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));
		
		Actions act=new Actions(driver);
//		act.sendKeys(UN,"admin").perform();
//		act.sendKeys(PW,"manager").perform();
//		act.click(login).perform();
		
		act.sendKeys(UN,"admin").sendKeys(PW,"manager").click(login).build().perform();
		
		
	}

}
