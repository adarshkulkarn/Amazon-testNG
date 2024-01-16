import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.zeromq.ZStar.Set;


public class Amazon {
	@Test(priority = 1)
	public void Login()
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		WebElement signin =driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		signin.sendKeys("adarshkulkarni31@gmail.com");
		driver.findElement(By.id("continue")).click();
		WebElement password =driver.findElement(By.id("ap_password"));
		password.sendKeys("Adarsh123");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement Searchbox =driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("cricket balls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement clicking = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div"));
		clicking.click();
		java.util.Set<String> handles=driver.getWindowHandles();
		for(String e:handles)
		{
			if(e.equals(handles))
			{
			}
			else
			{
				driver.switchTo().window(e);
			}
		}
		WebElement Qa=driver.findElement(By.id("quantity"));
		Select se1 = new Select(Qa);
		se1.selectByIndex(2);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		
	}
}
