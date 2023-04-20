package Pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olampics {
	
	@Test
	public void test() {
		//String countryName="United States of America";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		List<WebElement> countryList = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		for (int i = 0; i < countryList.size(); i++)
		{  //i=10     0<90 i++
			if(countryList.get(i).getText().equalsIgnoreCase("Egypt")) 
			{
				String goldMedal = driver.findElement(By.xpath("(//div[@title='Gold']/span)["+(i+1)+"]")).getText();
				String silverMedal = driver.findElement(By.xpath("(//div[@title='Silver']/span)["+(i+1)+"]")).getText();
				String bronzeMedal = driver.findElement(By.xpath("(//div[@title='Bronze']/span)["+(i+1)+"]")).getText();
				String totalMedal = driver.findElement(By.xpath("(//div[contains(@data-medal-id,'total-medals-row')])["+(i+1)+"]")).getText();
			System.out.println("\nGold Medal ==> "+goldMedal+" \n"+"Silver Medal ==> "
				+silverMedal+" \n"+"Bronze Medal ==> "+bronzeMedal+" \n"+"Total Medal ==> "+totalMedal+"\n");
			break;
			}
		}
	//	driver.quit();
	}

}
