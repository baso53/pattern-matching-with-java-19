//package comsysto.talks.demomaven;
//
//interface Request {}
//
//class StringRequest implements Request {
//  private final String stringValue;
//
//  StringRequest(String stringValue) {
//    this.stringValue = stringValue;
//  }
//
//  public String getStringValue() {
//    return stringValue;
//  }
//}
//
//class IntegerRequest implements Request {
//  private final Integer integerValue;
//
//  IntegerRequest(Integer integerValue) {
//    this.integerValue = integerValue;
//  }
//
//  public Integer getIntegerValue() {
//    return integerValue;
//  }
//}
//
//public class PatternMatching250_SwitchForTypes {
//
//  public static void main(String[] args) {
//    System.out.println(getRequestValue(new StringRequest("This is a string value.")));
//    System.out.println(getRequestValue(new IntegerRequest(12345)));
//    System.out.println(getRequestValue(new Request() {}));
//  }
//
//  static String getRequestValue(Request request) {
//    if (request instanceof StringRequest req) {
//      return req.getStringValue();
//    }
//
//    if (request instanceof IntegerRequest req) {
//      return req.getIntegerValue().toString();
//    }
//
//    return "Unsupported value";
//  }
//}
