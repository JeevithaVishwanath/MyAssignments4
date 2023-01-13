package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Jeevitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("V");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8668040651");
		driver.findElement(By.id("password_step_input")).sendKeys("jeevi18692");
		driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']")).click();
		driver.findElement(By.xpath("//option[text()='18']")).click();
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()='Jun']")).click();
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[text()='1992']")).click();
		driver.findElement(By.className("_8esa")).click();
		
		
		

	}

}
