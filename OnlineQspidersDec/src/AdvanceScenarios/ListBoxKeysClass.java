package AdvanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxKeysClass {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(1000);
WebElement daylist = driver.findElement(By.id("day"));
daylist.click();
//daylist.sendKeys(Keys.ARROW_UP);
//daylist.sendKeys(Keys.ARROW_DOWN);
//daylist.sendKeys(Keys.ARROW_DOWN);

Robot r=new Robot();
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_UP);


	}

}
