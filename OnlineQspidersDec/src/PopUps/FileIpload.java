package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileIpload {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.foundit.in/");
	driver.findElement(By.xpath("//i[@class='mqfihd-upload']")).click();
WebElement data = driver.findElement(By.id("file-upload"));
data.sendKeys("C:\\Users\\Shobha\\Documents\\SELENIUM NOTES.txt");


	}

}
