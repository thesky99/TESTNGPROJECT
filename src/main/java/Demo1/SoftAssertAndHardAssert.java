package Demo1;
	
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;



	public class SoftAssertAndHardAssert {
	 
	@Test
	 public void method1() {
	 
	  Assert.assertEquals(20, 20);
	  System.out.println("hello");
	  
	  
//	 Assert.assertEquals(19, 20,"kjdwkjkjwkje");
	  
	 
	 }
	 
	 
	 @Test
	 public void method2() {
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(19, 20, "value is not matching");
	  System.out.println("hiii");
	  sa.assertAll();  //This is nmandtory
	  

	 
	 }


}