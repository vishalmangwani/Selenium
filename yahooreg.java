import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class yahooreg 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://yahoomail.com");
	}
	public void register()
	{
		driver.findElement(By.id("login-signup")).click();
		driver.findElement(By.id("first-name")).sendKeys("abc");
		
	
	}
	public static void main(String[] args) 
	{
		yahooreg y=new yahooreg();
		y.open();
		y.register();
	}

}
