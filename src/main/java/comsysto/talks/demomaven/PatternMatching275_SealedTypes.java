package comsysto.talks.demomaven;

sealed interface Shape permits Triangle, Rectangle {}


non-sealed interface Triangle extends Shape {}
final class Equilateral implements Triangle {}
final class Right implements Triangle {}


final class Rectangle implements Shape {}


public class PatternMatching275_SealedTypes {

  public static void main(String[] args) {
    System.out.println(getType(new Equilateral()));
    System.out.println(getType(new Rectangle()));
  }

  static String getType(Shape request) {
    return switch (request) {
      case Number ignored -> "A number";
      case Equilateral ignored -> "An equilateral triangle";
      case Right ignored -> "A right triangle";
      case Rectangle ignored -> "A rectangle";
    };
  }
}
