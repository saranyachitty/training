package cbebuspage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main {


	public static void main(String[] args) throws Exception
	{
	
		bussearch bs=new bussearch();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\learnAutomation\\autoOne\\src\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://way2cbe.com/bus_terminals.php"); 
		 driver.manage().window().maximize();
		 WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		driver.findElement(bs.citybusinfo).click(); 
		driver.findElement(bs.citybussearch).click();
		
		String heading1=driver.findElement(bs.welcomecitybussearch).getText();
		System.out.println(heading1);
		
		String heading2=driver.findElement(bs.busroutes).getText();
		System.out.println(heading2);
		
		wait1.until(ExpectedConditions.presenceOfElementLocated(bs.nightserviceincbe));
		String heading3=driver.findElement(bs.nightserviceincbe).getText();
		System.out.println(heading3);
		
		//String heading4=driver.findElement(bs.routemap).getText();
		//System.out.println(heading4);
		
		//String heading5=driver.findElement(bs.reportadmin).getText();
		//System.out.println(heading5);
		
		//String heading6=driver.findElement(bs.SMS).getText();
		//System.out.println(heading6);
		
		Select src=new Select(driver.findElement(bs.citybusdd));
		Select dest=new Select(driver.findElement(bs.citybusdd1));
		src.selectByValue("100 feet/GP");
		dest.selectByValue("Aalandhurai");
		driver.findElement(bs.searchbus).click();
		
		String heading7=driver.findElement(bs.bussearchbody).getText();
		System.out.println(heading7);
		
		driver.findElement(bs.flightinfo).click();
		driver.findElement(bs.traininfo).click();
		driver.findElement(bs.busterminal).click();
		
		 
		 
	}

}
