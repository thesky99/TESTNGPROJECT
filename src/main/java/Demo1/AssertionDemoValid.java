package Demo1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionDemoValid {
	
	 @Test
	 public void Validlogin() {
	  
	     WebDriver driver = new ChromeDriver(); 

	   driver.get("https://login.salesforce.com/"); 
	   
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testdisdi");
	   
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test2");
	   
	   driver.findElement(By.xpath("//input[@name='Login']")).click();
	   
	   
	   
	   WebElement a=driver.findElement(By.xpath("//div[@id='CustomerService']"));
	   String actualText=a.getText();
	 
	   
	   String ExpectedText="Customer Service";
	  
	   SoftAssert sa=new SoftAssert();
	   sa.assertEquals(actualText,ExpectedText,"Valid Error message is not showing");
	   
	   sa.assertAll();
	   
	   
	   
	 }
	 
	 
	 
	 

}
