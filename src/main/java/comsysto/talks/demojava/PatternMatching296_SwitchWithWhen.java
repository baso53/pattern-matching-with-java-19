//package comsysto.talks.demojava;
//
//record IntegerHolder(Integer integerValue) { }
//
//public class PatternMatching296_SwitchWithWhen {
//
//  public static void main(String[] args) {
//    System.out.println(groupNumberBySize(5));
//    System.out.println(groupNumberBySize(new IntegerHolder(5)));
//    System.out.println(groupNumberBySize(500));
//    System.out.println(groupNumberBySize(new IntegerHolder(500)));
//    System.out.println(groupNumberBySize(new IntegerHolder(50000)));
//  }
//
//  static String groupNumberBySize(Object request) {
//    return switch (request) {
//      case Integer i when i < 10 -> i + " is small";
//      case IntegerHolder(var i) when i < 10 -> i + " is small";
//      case Integer i when i < 1000 -> i + " is medium";
//      case IntegerHolder(var i) when i < 1000 -> i + " is medium";
//      case Integer i when i >= 1000 -> i + " is big";
//      case IntegerHolder(var i) when i >= 1000 -> i + " is big";
//      default -> "neither big or small";
//    };
//  }
//}