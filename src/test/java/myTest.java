import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class myTest extends Parameters {
	
	final String groupCustomer = "Customer";
	final String groupManager = "Manager";

	
	
//  @Test(groups = groupCustomer, priority = 1)
//  public void login_as_cutomer() {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
//
//  }
	
	
  
//  @Test(groups = {groupManager}, priority = 1)
//  public void login_as_manager() {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
//  }
//  
//  @Test (groups = {groupManager}, priority = 2)
//  public void add_cutomer() throws InterruptedException {
//	  
//	  int userID = (int) (Math.random() * 1000);
//	  StringBuilder userName = new StringBuilder();
//	  userName.append(userID);
//	  String userIDtoString = userName.toString();
//	  
//	  
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
//	  
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Mr ");
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("user" + userIDtoString);
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("00011");
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
//	  
//	  Thread.sleep(2000);
//	  
//	  String addingAlertText = driver.switchTo().alert().getText();
//	  boolean check = addingAlertText.contains("successfully");
//	  softAssert.assertEquals(check, true, "==Customer is added successfully==   ");
//	  driver.switchTo().alert().accept();
//	  Thread.sleep(3000);
//
//	  
//	  driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
//	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("user" + userIDtoString);
//	
//	  Thread.sleep(3000);
//	  List <WebElement> myUsers = driver.findElements(By.xpath("//tbody/tr"));
//	  System.out.println("**********");
//	  System.out.println(myUsers.size());
//	  
//	  softAssert.assertEquals(myUsers.size(), 1);
//	  
//	  softAssert.assertAll();
//  }
  
  
  @Test 
  public void test_again() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
	  
	  WebElement myMenu = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
	  Select select = new Select(myMenu);
//	  select.selectByIndex(2);
	  select.selectByVisibleText("Harry Potter");
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
	  
	  Thread.sleep(2000);
	  
	  String deposit = "3500";
	  String witherdrown = "700";
	  
	  int witherdrownNum = Integer.parseInt(witherdrown);
	  
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();	  
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(deposit);
	  
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
	  
	  Thread.sleep(2000);

	  String myOriginalBalance = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
	  int myOriginalBalanceInt = Integer.parseInt(myOriginalBalance);
	  
	  Thread.sleep(2000);

	  
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
	  Thread.sleep(4000);

	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(witherdrown);
	  
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
	  
	  Thread.sleep(2000);
	  
	  String myCurrentBalance = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
	  int myCurrentBalanceInt = Integer.parseInt(myCurrentBalance);
	  
	  Thread.sleep(2000);

	  
	  System.out.println("myOriginalBalanceInt  " + myOriginalBalanceInt);
	  System.out.println("myCurrentBalanceInt" + myCurrentBalanceInt);

	  softAssert.assertEquals(myCurrentBalanceInt, myOriginalBalanceInt-witherdrownNum);
	  softAssert.assertAll();


	  
	  
	  
	  
  }
  
}
