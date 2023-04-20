package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//Dynamic Xpath
		String month = "February 2023";
		String date = "12";
		
    driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::"
		+ "div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();

}
}