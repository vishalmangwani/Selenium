import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class gmaild 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	}
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("sometext2000");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("somethingtext");
		driver.findElement(By.id("signIn")).click();
	}
	public void logout()
	{
		driver.findElement(By.cssSelector("span.gb_Ka.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		gmaild g=new gmaild();
		g.open();
		g.login();
		Thread.sleep(3000);
		g.logout();
	}

}
