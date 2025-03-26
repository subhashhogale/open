package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setupbrowser {

	
		@Test
		public void strat() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=qR20KF7wxSU");;
//
		}

}
