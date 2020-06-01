package datestuff;

import java.time.LocalDate;

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
    return dayOfWeek(this.day, this.month, this.year);
  }

  public static void main(String[] args) {
    System.out.println("Is 2000 a leap year? " + isLeap(2000));
    System.out.println("Day of week of Jan 1, 2000? "
        + dayOfWeek(1, 1, 2000));
    System.out.println("Day of week of Jan 1, 2000? "
        + dayOfWeek(new Date(1, 1, 2000)));
    System.out.println("Day of week of Jan 1, 2000? "
        + new Date(1, 1, 2000).dayOfWeek());

    Date theDate = new Date(1, 1, 2000);
    System.out.println("Day of week of Jan 1, 2000? "
        + theDate.dayOfWeek());
  }
}
