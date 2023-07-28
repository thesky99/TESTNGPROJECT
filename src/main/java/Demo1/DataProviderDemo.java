package Demo1;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
 
 
 @Test(dataProvider="testData")
 public void login(String username, String password) {
  
      WebDriver driver = new ChromeDriver(); 

  driver.get("https://login.salesforce.com/"); 
  
  driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
  
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
  
  driver.findElement(By.xpath("//input[@name='Login']")).click();
  
  
 
 }
 
 
 @DataProvider
 public Object[][] testData() {
  Object[][] data=new Object[3][2];
  data[0][0]="testuser1";
  data[0][1]="secure123";
  data[1][0]="testuser2";
  data[1][1]="secure345";
  data[2][0]="testuser3";
  data[2][1]="secure789";
  return data;
 }
 
 
}
