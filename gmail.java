import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class gmail 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
	}
	public void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("Email")).sendKeys("");
		driver.findElement(By.name("signIn")).click();
		driver.findElement(By.name("Passwd")).sendKeys("");	
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span.gb_Ka.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
			gmail y=new gmail();
			y.open();
			y.login();
	}

}
