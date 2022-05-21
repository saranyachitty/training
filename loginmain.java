package internerheroapp;

import java.io.IOException;
import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginmain 

{
	public static WebDriver driver;
	public static loginpage obj=new loginpage();
	public static loginmain obj1=new loginmain();
	//WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
	//WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	//WebElement loginbtn=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
	//WebElement nocredentials=driver.findElement(By.xpath("//div[@class='flash error']"));
	//WebElement nousername=driver.findElement(By.xpath("//div[@class='flash error']"));
	//WebElement nopwd=driver.findElement(By.xpath("//div[@class='flash error']"));
	//WebElement loginsuccess=driver.findElement(By.xpath("//div[h2]//h4"));

	 
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\learnAutomation\\autoOne\\src\\chromedriver.exe");
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/login"); 
		driver.manage().window().maximize();
			
		obj1.blank();
		obj1.invalidusername();
		obj1.invalidpwd();
		obj1.success();
		 
	}
	
	public void blank()
	{
		driver.findElement(obj.login).click();
	    
	    WebElement nocredentials=driver.findElement(By.xpath("//div[@class='flash error']"));
	    nocredentials.getText();
	}
	
	public void invalidusername()
	{
		
		driver.findElement(obj.password).sendKeys("SuperSecretPassword!");
		
		driver.findElement(obj.login).click();
		
		String s1=driver.findElement(obj.nousername).getText();
		System.out.println(s1);
		
	}
	
	public void invalidpwd()
	{
		driver.findElement(obj.username).sendKeys("tomsmith");
		
		driver.findElement(obj.login).click();
		
		String s2=driver.findElement(obj.nopwd).getText();
		System.out.println(s2);
				
		
		
	}
	public void success()
	{
		driver.findElement(obj.username).sendKeys("tosmith");
		driver.findElement(obj.password).sendKeys("SuperSecretPassword!");
		driver.findElement(obj.login).click();
		String s3=driver.findElement(obj.loginsuccess).getText();
		System.out.println(s3);
		driver.close();
	}









}
