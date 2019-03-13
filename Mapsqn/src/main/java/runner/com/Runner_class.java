package runner.com;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "stepdefination" }, tags = { "@HomePage" })

public class Runner_class {

	public void welcomePage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bbhusha3\\eclipse-workspace\\Mapsqn\\src\\main\\resources\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open facebook
		driver.get("http://www.mapsynq.com/");

		// Maximize browser

		driver.manage().window().maximize();
	}

}
