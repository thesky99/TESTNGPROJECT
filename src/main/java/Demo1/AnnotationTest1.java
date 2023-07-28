package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest1 {
	
	 @Test
	 public void method1() {
	  System.out.println("i am method1 from class test1");
	 }
	 
	 @Test
	 public void method2() {
	  System.out.println("i am method2 from class test1");
	 }
	 
	 @BeforeSuite
	 public void method3() {
	  System.out.println("i am method3 from class test1 beforeSuite");
	 }
	 
	 
	 @AfterSuite
	 public void method4() {
	  System.out.println("i am method4 from class test1 AfterSuite");
	 }
	 
	 
	 
	 @BeforeTest
	 public void method5() {
	  System.out.println("i am method5 from class test1 beforeTest");
	 }
	 
	 
	 @AfterTest
	 public void method6() {
	  System.out.println("i am method6 from class test1 afterTest");
	 }
	 
	 
	 @AfterClass
	 public void method7() {
	  System.out.println("i am method7 from class test1 afterclass");
	 }
	 
	 
	 @BeforeClass
	 public void method8() {
	  System.out.println("i am method8 from class test1 beforeClass");
	 }

}
