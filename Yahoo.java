import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;


public class Yahoo {

	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http:/facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void search()
	{
		driver.findElement(By.id("email")).sendKeys("undeclared");
		driver.findElement(By.id("pass")).sendKeys("undeclared");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

	public static void main(String args[])
	{
		Yahoo obj=new Yahoo();
		obj.open();
		obj.search();
	}
}
