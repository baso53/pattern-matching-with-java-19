//package comsysto.talks.demojava;
//
//sealed interface Request permits StringRequest, IntegerRequest, StringDelegateRequest { }
//
//record StringRequest(String stringValue) implements Request { }
//
//record IntegerRequest(Integer integerValue) implements Request { }
//
//record StringDelegateRequest(StringRequest delegate) implements Request {
//  StringDelegateRequest(String stringValue) {
//    this(new StringRequest(stringValue));
//  }
//}
//
//public class PatternMatching296_SwitchWithVar {
//
//  public static void main(String[] args) {
//    System.out.println(getRequestValue(new StringRequest("This is a string value.")));
//    System.out.println(getRequestValue(new IntegerRequest(12345)));
//    System.out.println(getRequestValue(new StringDelegateRequest("This is a delegate string value.")));
//  }
//
//  static String getRequestValue(Request request) {
//    return switch (request) {
//      case StringRequest(String value) -> value;
//      case IntegerRequest(Integer value) -> value.toString();
//      case StringDelegateRequest(StringRequest(String value)) -> value;
//    };
//  }
//}
