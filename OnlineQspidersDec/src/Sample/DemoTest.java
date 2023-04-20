package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void DemoTest()
	{
		String Key="webdriver.chrome.driver";
	String Value="./chromedriver.exe";
	//String Value="C:\Users\Shobha\Downloads\chromedriver_win32 (10)\\chromedriver.exe";
	System.setProperty(Key, Value);
	
	WebDriver driver=new ChromeDriver();
	
 driver.get("https://www.amazon.in/");
		
		//pushed nd pulling back
 //pulled nd pushing back
		//2nd pull
}
}
