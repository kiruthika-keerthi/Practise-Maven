package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProKabadi {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.prokabaddi.com/");
	driver.findElement(By.xpath("//a[@title='Matches']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("(//div[@class='selected-title'])[1]")).click();
	WebElement data = driver.findElement(By.xpath("(//div[@class='selected-title'])[1]"));
	data.click();
	Thread.sleep(1000);
//	Select sel=new Select(data);
//	sel.selectByVisibleText("\r\n"
//			+ "                  Season 6\r\n"
//			+ "                ");
	
	driver.findElement(By.xpath("(//button[normalize-space(text()='                   Season 6                 ')])[13]")).click();
	
	}

}
