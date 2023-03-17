package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBankAss {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://uibank.uipath.com/register-account");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("vasanth");
		
		WebElement dropDown = driver.findElement(By.id("title"));
		Select selectDropDown = new Select(dropDown);
		selectDropDown.selectByValue("mr");
		
		driver.findElement(By.id("middleName")).sendKeys("R");
		
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
		WebElement dropDown1 = driver.findElement(By.id("sex"));
		Select selectDropDown1 = new Select(dropDown1);
		selectDropDown1.selectByValue("male");
		
		WebElement dropDown2 = driver.findElement(By.id("employmentStatus"));
		Select selectDropDown2 = new Select(dropDown2);
		selectDropDown2.selectByVisibleText("Unemployed");
		
		driver.findElement(By.id("age")).sendKeys("(04/26/2001)");
		
		WebElement dropDown3 = driver.findElement(By.id("maritalStatus"));
		Select selectDropDown3 = new Select(dropDown3);
		selectDropDown3.selectByValue("Single");
		
		driver.findElement(By.id("username")).sendKeys("vasanth");
		
		driver.findElement(By.id("email")).sendKeys("vasanhkumar4620@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("vasanth123");
		
		driver.close();
	
		
}
}
