package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static Properties prop;
	protected static WebDriver driver;
	
	public BaseClass()
	{
		prop = new Properties();
		String path = System.getProperty("user.dir") +"//src//main//java//ConfigurationLayer//config.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static void initialization()
	{
		 driver = new ChromeDriver();
		// connect browser
			// up casting
			driver = new ChromeDriver();
			// implicitlyWait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// pageLoadTimeout
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			// maximize
			driver.manage().window().maximize();
			// delete all cookies
			driver.manage().deleteAllCookies();
			// capture url from Properties file
			
			String url =prop.getProperty("URL");
			
			driver.get(url);
	}
	

}
