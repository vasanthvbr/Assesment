package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimonyAss {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.tamilmatrimony.in/");
	
	driver.manage().window().maximize();
	
	WebElement dropDown = driver.findElement(By.id("REGISTERED_BY"));
	Select selectDropDown = new Select(dropDown);
	selectDropDown.selectByValue("1");
	
	driver.findElement(By.id("NAME")).sendKeys("Revanth");
	
	WebElement radio = driver.findElement(By.id("gendermale"));radio.click();
	
	WebElement dropDown1 = driver.findElement(By.id("DOBDAY"));
	Select selectDropDown1 = new Select(dropDown1);
	selectDropDown1.selectByValue("7");
	
	WebElement dropDown2 = driver.findElement(By.id("DOBMONTH"));
	Select selectDropDown2 = new Select(dropDown2);
	selectDropDown2.selectByValue("2");
	
	WebElement dropDown3 = driver.findElement(By.id("DOBYEAR"));
	Select selectDropDown3 = new Select(dropDown3);
	selectDropDown3.selectByValue("1999");
	
	WebElement dropDown4 = driver.findElement(By.id("RELIGION"));
	Select selectDropDown4 = new Select(dropDown4);
	selectDropDown4.selectByVisibleText("Hindu");
	
	WebElement dropDown5 = driver.findElement(By.id("COUNTRY"));
	Select selectDropDown5 = new Select(dropDown5);
	selectDropDown5.selectByValue("98");
	
	driver.findElement(By.id("MOBILENO")).sendKeys("8220585268");
	
	driver.findElement(By.id("EMAIL")).sendKeys("revanthkishanth@gmail.com");
	
	driver.findElement(By.name("PASSWD1")).sendKeys("revanth@123");
	
	//driver.findElement(By.xpath("(//input[contains(@class,'hp-button txtupper hp-regbtn')])")).click();
	
	driver.close();
	
}
}
