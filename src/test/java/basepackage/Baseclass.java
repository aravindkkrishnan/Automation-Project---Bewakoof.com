package basepackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Baseclass
{
		public static WebDriver driver;
		String baseurl = "https://www.bewakoof.com/";
		
		@BeforeTest
		public void setup()
		{
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("autofill.profile_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			
			driver = new ChromeDriver(options );
			driver.get(baseurl);
			
			driver.manage().window().maximize();	
		}

}

