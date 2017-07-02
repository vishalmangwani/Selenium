import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.gargoylesoftware.htmlunit.WebClient;


public class One {

	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
	}
	public void search()
	{
		//WebClient w=driver.findElement(By.name("q"));
		//w.sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnh")).click();
		
	}

	
	
	public static void main(String args[]){

		
	}

}
