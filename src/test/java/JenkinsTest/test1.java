package JenkinsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

	// TODO Auto-generated method stub

	public WebDriver driver ;

	
	 @BeforeTest 
	 public void setup() 
	 {
		
    String path=System.getProperty("user.dir");
	 System.out.println(path+"\\src\\test\\resources\\Driver\\chromedriver.exe");
	 System.setProperty("webdriver.chrome.driver",path+"\\src\\test\\resources\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://google.com"); 
	 driver.manage().window().maximize();
	 }
	 

	@Test
	public void search() throws InterruptedException {

		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Sreyas");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		 
	}
	
	@AfterTest 
	public void end() 
	{
		driver.quit(); 
	}
	 

}
