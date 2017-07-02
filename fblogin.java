import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class fblogin 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("mailid2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mailid1234");
		driver.findElement(By.id("u_0_v")).click();
		driver.findElement(By.xpath("//*[@id='captcha']/div/a")).click();
	}
	public static void main(String[] args) 
	{
		fblogin f=new fblogin();
		f.open();
		f.login();
	}

}
