package leapyears_java;

public class LeapYear {

  Integer year;

  public LeapYear(Integer inputyear){
    year = inputyear;
  }

  public Boolean isleapyear(){
    if (year % 4 != 0){
      return false;
    }
    if (year % 4 != 0 && year % 100 == 0){
      return false;
    }
    if (year % 100 == 0 && year % 400 != 0){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    
  }

}
