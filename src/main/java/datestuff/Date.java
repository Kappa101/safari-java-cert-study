package datestuff;

import java.time.LocalDate;
class Holiday extends Date {
  private String name;
  public Holiday(int d, int m, String name) {
    this(d, m, 2020, name);
  }

  public Holiday(int d, int m, int y, String name) {
    super(d, m, y);
    this.name = name;
  }

  public String toString() {
    return "Holiday named " + this.name + super.toString();
  }
}

public class Date {
  int day;
  int month;
  int year;

  public Date(int d, int m, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public static boolean isLeap(int year) {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }

  public static int daysInMonth(int month, int year) {
    return 0;
  }

  // Zeller's congruence (saturday = 0...)
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static int dayOfWeek(Date d) {
    return dayOfWeek(d.day, d.month, d.year);
  }

  public int dayOfWeek(Date this) {
//    return dayOfWeek(this.day, this.month, this.year);
    int day = 0;
    return dayOfWeek(this.day, month, year);
  }

  public String toString() {
    return "Date with day = " + this.day;
  }


  public static void main(String[] args) {
    System.out.println("Is 2000 a leap year? " + isLeap(2000));
    System.out.println("Day of week of Jan 1, 2000? "
        + Date.dayOfWeek(1, 1, 2000));
    System.out.println("Day of week of Jan 1, 2000? "
        + dayOfWeek(new Date(1, 1, 2000)));
    System.out.println("Day of week of Jan 1, 2000? "
        + new Date(1, 1, 2000).dayOfWeek());

    Date theDate = new Date(1, 1, 2000);
    System.out.println("Day of week of Jan 1, 2000? "
        + theDate.dayOfWeek());

    System.out.println("theDate is " + theDate.toString());
    System.out.println("theDate is " + theDate);

    Date h = new Holiday(1, 1, 2000, "new years day");
    System.out.println("theDate is " + h.toString());
  }
}
