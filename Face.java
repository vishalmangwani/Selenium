import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;


public class Face  {

	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.skilledpool.com/jobseeker/registration");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void search()
	{
		driver.findElement(By.id("firstname")).sendKeys("Abhishek");
		//driver.findElement(By.id("next")).click();
		//for(int i=0;i<100;i++){
		driver.findElement(By.id("lastname")).sendKeys("Patangi");
		driver.findElement(By.id("email")).sendKeys("patangiabhishek@gmail.com");
		//driver.findElement(By.id("signIn")).click();
		//driver.findElement(By.cssSelector("span.gb_Ka.gbii")).click();
		//driver.findElement(By.id("gb_71")).click();
		//}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String args[])
	{
		Face obj=new Face();
		obj.open();
		obj.search();
	}
}
