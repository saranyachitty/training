package internerheroapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage 
{
 public By username=By.xpath("//input[@type='text']");
 public By password=By.xpath("//input[@type='password']");
 public By login=By.xpath("//i[@class='fa fa-2x fa-sign-in']");
 public By nocredentials=By.xpath("//div[@class='flash error']");
public By nousername=By.xpath("//div[@class='flash error']");
public By nopwd=By.xpath("//div[@class='flash error']");
public By loginsuccess=By.xpath("//div[h2]//h4");
 
 
 


}