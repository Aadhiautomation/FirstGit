package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumhandson {
	
	public static void main(String[] args)
	{
		
		System.out.print("Hello");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://gmail.com");
		String title = driver.getTitle();
		System.out.print(title);
	}

}
