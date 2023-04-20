package AdvanceScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElement {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();

	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));//363

	int count=0;//1------//363

	for(WebElement wb:allLinks)//1
	{
		System.out.println(wb.getText());//1//2
		count++;
	}
	System.out.println("total no of links:"+count);
		}

}
