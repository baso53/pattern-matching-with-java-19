//package comsysto.talks.demojava;
//
//sealed interface Fun permits When {}
//
//record When() implements Fun {
//  public static Boolean when = true;
//}
//
//public class PatternMatching298_FunWithWhen {
//
// public static void main(String[] args) {
//   System.out.println(letsHaveSomeFun(new When()));
// }
//
// static String letsHaveSomeFun(Fun fun) {
//   return switch (fun) {
//     case When when when when.when -> when();
//     default -> "Default";
//   };
// }
//
// static String when() {return "When?";}
//}