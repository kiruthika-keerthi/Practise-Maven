package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKartTest {

	@Test
	public void FlipKart() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement data = driver.findElement(By.name("field-keywords"));
	    data.sendKeys("iphone13");
       driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
