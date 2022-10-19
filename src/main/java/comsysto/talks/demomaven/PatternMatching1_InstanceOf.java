package comsysto.talks.demomaven;

import java.math.BigDecimal;

public class PatternMatching1_InstanceOf {

  public static void main(String[] args) {
    System.out.println(handleObject("testString"));
    System.out.println(handleObject(999));
    System.out.println(handleObject(BigDecimal.ONE));
  }

  static String handleObject(Object testObject) {
    if (testObject instanceof Integer) {
      var integer = (Integer) testObject;
      return "This object multiplied by 1000 is: " + integer * 1000;
    }

    if (testObject instanceof String) {
      var string = (String) testObject;
      return "This object in uppercase is: " + string.toUpperCase();
    }

    throw new IllegalArgumentException("Unsupported object type");
  }

}
