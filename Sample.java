import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
{
	FirefoxDriver driver;
	public void open() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
	}
	public void search()
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btng")).click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Sample s=new Sample();
		s.open();
		s.search();
	}
}
