package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olymapics {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
//		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
//		
//driver.findElement(By.xpath("//h1[@class='styles__Header-sc-31x12v-0 irZdLo']"
//		+ "/ancestor::section[@class='medals__Wrapper-sc-15nhwt9-0 kdLiik']"
//		+ "/descendant::div[@data-cy='table-header']"));


		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		String countryName="Argentina";
		
		String country = driver.findElement(By.xpath("//div[@data-cy='table-content']/..//div[@class='styles__CountryWrapper-sc-fehzzg-4 LiGRO']//span[.='"+countryName+"']")).getText();
		String gold = driver.findElement(By.xpath("//span[.='"+countryName+"']/../..//div[4]")).getText();
		String silver = driver.findElement(By.xpath("//span[.='"+countryName+"']/../..//div[5]")).getText();
		String bronze = driver.findElement(By.xpath("//span[.='"+countryName+"']/../..//div[6]")).getText();
		String total = driver.findElement(By.xpath("//span[.='"+countryName+"']/../..//div[7]")).getText();
		
		System.out.println("countryName="+country+" gold="+gold+" silver="+silver+" bronze="+bronze+" total="+total);

	}

}
