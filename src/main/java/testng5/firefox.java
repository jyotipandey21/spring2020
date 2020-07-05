package testng5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
	WebDriver driver;
	@Test
	 public void element() {
		 System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		 	 driver=new FirefoxDriver();
		 	 driver.get("http://www.techfios.com//ibilling//?ng=admin");
		 	 		 
		 	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
