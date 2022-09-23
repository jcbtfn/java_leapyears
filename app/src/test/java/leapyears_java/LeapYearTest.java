package leapyears_java;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test 
  public void appExistsandReturnBoolean() {
    LeapYear isLeapYear = new LeapYear(2000);
    assertTrue(isLeapYear.isleapyear()); 
  }

  @Test 
  public void appevaluatesthefirstcondition() {
    LeapYear isLeapYear = new LeapYear(2002);
    assertFalse(isLeapYear.isleapyear()); 
  }

  @Test 
  public void appevaluatesthesecondcondition() {
    // LeapYear isLeapYear = new LeapYear(2008);
    // assertTrue(isLeapYear.isleapyear()); 
    LeapYear isLeapYear2 = new LeapYear(2010);
    assertFalse(isLeapYear2.isleapyear()); 
    LeapYear isLeapYear3 = new LeapYear(2008);
    assertTrue(isLeapYear3.isleapyear()); 
    LeapYear isLeapYear4 = new LeapYear(1700);
    assertFalse(isLeapYear4.isleapyear()); 
    LeapYear isLeapYear5 = new LeapYear(2000);
    assertTrue(isLeapYear5.isleapyear()); 
    LeapYear isLeapYear6 = new LeapYear(1600);
    assertTrue(isLeapYear6.isleapyear()); 
    LeapYear isLeapYear7 = new LeapYear(4);
    assertTrue(isLeapYear7.isleapyear()); 
  }



}

// 2004 2008
// 2004 2005 2006 2007 2008
