package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
		Select drop=new Select(tool);
		drop.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		
		
		

	}

}
