package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	  public  HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	  //declaration
	@FindBy(linkText="View Time-Track")
	private WebElement enterlinktext;

	//getter method
	public WebElement getEnterlinktext() {
		return enterlinktext;
	}
	//business logics
	public void clickLink()
	{
		enterlinktext.click();
	}
}


//Practise-maven

//change the name

//eclipse changes

//again changes
