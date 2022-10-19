package comsysto.talks.demomaven;

enum DayOfWeek {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY
}

public class PatternMatching200_SwitchForEnum {

  public static void main(String[] args) {
    System.out.println(isWeekday(DayOfWeek.MONDAY));
    System.out.println(isWeekday(DayOfWeek.WEDNESDAY));
    System.out.println(isWeekday(DayOfWeek.SUNDAY));
  }

  static boolean isWeekday(DayOfWeek day) {
    var result = true;

    switch (day) {
      case MONDAY:
      case TUESDAY:
      case WEDNESDAY:
      case THURSDAY:
      case FRIDAY: result = true; break;
      case SATURDAY: result = false; break;
    }

    return result;
  }
}
