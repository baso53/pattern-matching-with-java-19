//package comsysto.talks.demojava;
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
//public class PatternMatching292_SwitchForRecords {
//
//  public static void main(String[] args) {
//    System.out.println(getRequestValue(new StringRequest("This is a string value.")));
//    System.out.println(getRequestValue(new IntegerRequest(12345)));
//    System.out.println(getRequestValue(new Request() {}));
//  }
//
//  static String getRequestValue(Request request) {
//    return switch (request) {
//      case StringRequest req -> req.getStringValue();
//      case IntegerRequest req -> req.getIntegerValue().toString();
//      default -> "Unsupported value";
//    };
//  }
//}
