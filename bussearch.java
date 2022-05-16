package cbebuspage;

import org.openqa.selenium.By;


public class bussearch
{
	// Top links
	public By citybussearch=By.xpath("//a[contains(text(),'CityBus Search')]");
	public By busroutes=By.xpath("//a[contains(text(),'Bus Routes')]");
	public By nightservice=By.xpath("//a[contains(text(),'Night Services')]");
	public By map=By.xpath("//div[@id='templatemo_menu']//a[@href='map.php']");
	public By reportbug=By.xpath("//a[contains(text(),'Report a Bug')]");
	public By SMSkeywords=By.xpath("//a[contains(text(),'SMS Keywords')]");
	
	//side links
	public By citybusinfo=By.xpath("//a[contains(text(),'City Bus Info')]");
	public By flightinfo=By.xpath("//a[contains(text(),'Flight Info')]");
	public By traininfo=By.xpath("//a[contains(text(),'Train Info')]");
	public By busterminal=By.xpath("//div[@class='body']//a[@href='bus_terminals.php']");
	
	
	//dropdowns
	public By citybusdd=By.xpath("//select[@name='source']");
	public By citybusdd1=By.xpath("//select[@name='des']");
	public By searchbus=By.id("searchbutton");
	
	//headings
	public By welcomecitybussearch=By.xpath("//div[@class='templatemo_box']//h2[contains (text(),'Welcome to Coimbatore CityBus Search')]");
	public By citybusroute=By.xpath("//div[@class='templatemo_box']//h2[contains (text(),'CityBus Route and Stop Details')]");
	public By nightserviceincbe=By.xpath("//div[@class='templatemo_box']//h2[contains (text(),'Night Services in Coimbatore')]");
	public By routemap=By.xpath("//div[@class='templatemo_box']//h2[contains (text(),'City Bus Route Map')]");
	public By reportadmin=By.xpath("//div[@class='templatemo_box']//h2[contains (text(),'Report to the Administrator')]");
	public By SMS=By.xpath("//div[@class='templatemo_box']//h2[contains (text(),'way2cbe SMS Procedure')]");
	public By bussearchbody=By.xpath("//div[@id='templatemo_content']//div[@class='templatemo_box']//div[1]");
	
	
	
	
	
	
	
	

}
