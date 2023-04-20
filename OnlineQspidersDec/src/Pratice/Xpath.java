package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//button[text()='✕']")).click();

driver.findElement(By.name("q")).sendKeys("iphone");
driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

Thread.sleep(2000);
String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']/../../div[2]/div[1]")).getText();
	System.out.println(price);
	
	}

}
