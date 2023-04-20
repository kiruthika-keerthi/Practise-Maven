package Pratice;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/* driver.get("https://www.google.com");
		WebElement data = driver.findElement(By.name("q"));
       data.sendKeys("Selenium");
       data.submit();*/
		
		driver.get("https://demo.actitime.com/login.do");
     /*  WebElement data = driver.findElement(By.id("username"));
       data.sendKeys("admin");
       Thread.sleep(2000);
     // data.clear();
   	//Dimension is a class
        Dimension dim = data.getSize();
        System.out.println(dim.getHeight()+"--------"+dim.getWidth());
       
       WebElement password = driver.findElement(By.name("pwd"));
       password.sendKeys("manager");
       Dimension Dime = password.getSize();
       System.out.println(Dime.getHeight()+"----------"+Dime.getWidth());
       
       //point getLocation
       Point loc = data.getLocation();
       System.out.println(loc.getX()+"------"+loc.getY());
       
       //Rect
       Rectangle rec = data.getRect();
       System.out.println(rec.getHeight()+"------"+rec.getWidth());
       System.out.println(rec.getX()+"---------"+rec.getY());*/
       
       //isDisplayed
      /* WebElement logo = driver.findElement(By.className("atLogoImg"));
       if(logo.isDisplayed())
       {
    	   System.out.println("logo is visible");
       }
       else
       {
    	   System.out.println("logo is not visible");
       }*/
     //isEnable
		/*WebElement UserName = driver.findElement(By.id("username"));
	if(UserName.isEnabled())
	{
		UserName.sendKeys("admin");
	}
	else
	{
		System.out.println("user textFiels is Disabled");
	}*/
		
		//isSelected
		/*WebElement chechBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		chechBox.click();
		if(chechBox.isSelected())
		{
			System.out.println("checked");
		}
		else
		{
			System.out.println("not checked");
		}*/
		//getTagName
		WebElement UN = driver.findElement(By.id("username"));
		UN.sendKeys("admin");
		System.out.println(UN.getTagName());
		
		//getAttribute
		//String attribute = UN.getAttribute("class");
		//System.out.println("name attribute value is:"+attribute);
		
		//getDomAttribute
	/*	WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("admin");
		System.out.println(UserName.getDomAttribute("name"));
		
		//getDomProperty
		System.out.println(UserName.getDomProperty("placeholder"));
		
		WebElement login = driver.findElement(By.id("loginButton"));
		System.out.println(login.getDomProperty("class"));*/
		
	/*	driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement taskLink = driver.findElement(By.cssSelector("a.tasks"));
System.out.println("name of the task in Dom is:");
System.out.println(taskLink.getAccessibleName());
//taskLink.findElement(By.id("container_tasks")).click();*/
		
	//getArialRole
		//WebElement user = driver.findElement(By.id("username"));
		//System.out.println(user.getAriaRole());
		
	//	WebElement login = driver.findElement(By.id("loginButton"));
		//System.out.println(login.getAriaRole());

		
	}
}
