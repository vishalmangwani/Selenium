import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class fbreg 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	public void register()
	{
		driver.findElement(By.id("u_0_1")).sendKeys("samplefirst");
		driver.findElement(By.id("u_0_3")).sendKeys("samplelast");
		driver.findElement(By.id("u_0_5")).sendKeys("mailid2@gmail.com");
		driver.findElement(By.id("u_0_8")).sendKeys("mailid2@gmail.com");
		driver.findElement(By.id("u_0_a")).sendKeys("mailid1234");
		driver.findElement(By.xpath("//*[@id='day']/option[@value='23']")).click();
	    driver.findElement(By.xpath("//*[@id='month']/option[@value='2']")).click();
	    driver.findElement(By.xpath("//*[@id='year']/option[@value='1994']")).click();
		/*Select se=new Select(driver.findElement(By.id("day")));
		se.selectByIndex(3);
		Select se1=new Select(driver.findElement(By.id("month")));
		se1.selectByIndex(4);
		Select se2=new Select(driver.findElement(By.id("year")));
		se2.selectByValue("1990");*/
		driver.findElement(By.id("u_0_e")).click();
		driver.findElement(By.id("u_0_i")).click();
	}
	public static void main(String[] args) 
	{
		fbreg f=new fbreg();
		f.open();
		f.register();
	}

}
