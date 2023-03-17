package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class FacebookAss {
	public static void main(String[] args) {
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Vasanth");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("Vasanthkumar4620@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Vasanthkumar4620@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("vasanth123");
		
		WebElement dropDown = driver.findElement(By.id("day"));
		Select selectDropDown = new  Select(dropDown);
		selectDropDown.selectByValue("26");
		
		WebElement dropDown1 = driver.findElement(By.id("month"));
		Select selectDropDown1 = new  Select(dropDown1);
		selectDropDown1.selectByValue("4");
		
		WebElement dropDown2 = driver.findElement(By.id("year"));
		Select selectDropDown2 =new Select(dropDown2);
		selectDropDown2.selectByVisibleText("2001");
		
		WebElement radio = driver.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]"));radio.click();
		
		driver.close();
		
		
		
	}
}

