import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest

{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/usr/bin/chromium-browser");
		options.addArguments("--headless");
        options.addArguments("--no-sandbox");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		System.out.println("Welcome to Release Management on AWS-DevOps");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com");
		driver.get("http://localhost:80/Login.html");
		driver.findElement(By.name("userid")).sendKeys("myuserid");
		driver.findElement(By.name("pswrd")).sendKeys("mypswrd");
		driver.findElement(By.name("LoginB")).click();
		System.out.println("Test Successful");

	}

}
