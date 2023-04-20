package Pratice;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Object_Repo.HomePage;
import Object_Repo.LoginPage;

public class Properties_File {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		
		 //step1:Connect java with Properties file
		 FileInputStream fis=new FileInputStream("./PropertyData.properties.txt");
		 
		 //Step2:Load the Properties File To java System
		 Properties pro=new Properties();
		 pro.load(fis);
		 
		 //Step3:Fetch data from file
		 String URL = pro.getProperty("url");
		 String USERNAME = pro.getProperty("username");
		 String PASSWORD = pro.getProperty("password");
		
                driver.get(URL);
                
                LoginPage login=new LoginPage(driver);
                login.logintoApp(USERNAME, PASSWORD);
                
                Thread.sleep(1000);
                HomePage home=new HomePage(driver);
                home.clickLink();
                
                
//		        driver.findElement(By.id("username")).sendKeys(USERNAME);
//                driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
//                driver.findElement(By.id("loginButton")).click();
          
               driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
           	 driver.findElement(By.linkText("Types of Work")).click();
           		 driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
           		 
           		//Fetching Data from Excel
           		 
           		 //Connect to Excel Sheet
           		 FileInputStream efis=new FileInputStream("./OnlineQspiders.xlsx"); 
           		 
           		 //Load Excel in Java
           		 Workbook book=WorkbookFactory.create(efis);  
           		 
           		 //Fetch the required Sheet
           	     Sheet sh = book.getSheet("Data");
           	     
           	     //Fetch the Requried row
           	     Row row = sh.getRow(4);
           	     
           	     //Fetch the Required Cell
           	     Cell cell = row.getCell(1);
           	     
           	     //fetch the Data
           		 String ExcelData = cell.getStringCellValue();
           		  driver.findElement(By.name("name")).sendKeys(ExcelData);
              
	}

}
