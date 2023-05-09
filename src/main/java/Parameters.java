import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	
	public WebDriver driver;
	String myURL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	SoftAssert softAssert = new SoftAssert();
	 
	
	@BeforeClass 
	  public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(myURL);
		
	  }

}
