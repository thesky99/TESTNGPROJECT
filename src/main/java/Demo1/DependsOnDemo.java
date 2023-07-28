package Demo1;
	
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class DependsOnDemo {

	 @Test(dependsOnMethods= {"method2"})
	 public void method1() {

	  System.out.println("hello1");
	 }
	 
	 
	 @Test
	 public void method2() {
	        SoftAssert Assert=new SoftAssert();
	        Assert.assertEquals("hello", "hello23");
	  System.out.println("hello2");
	  Assert.assertAll();
	 }

}
