package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println("Webpage opened");
		WebElement element = driver.findElement(By.id("search"));
		System.out.println(element.isEnabled());
		element.sendKeys("Tin toy boat");
		WebElement element2 = driver.findElement(By.id("search-icon-legacy"));
		element2.submit();
		driver.close();
		
    }
}
