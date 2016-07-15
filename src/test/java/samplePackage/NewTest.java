package samplePackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class NewTest {
	SoftAssert sassert=new SoftAssert();;
  @Test
  public void f() {
	  sassert.assertEquals("HI", "ko","not matching");
	  sassert.assertAll();
  }
}
