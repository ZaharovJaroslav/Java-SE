package main.java.calendar.service;

import main.java.calendar.model.Сalendar;
import java.time.LocalDate;


public class CalendarService {
  private final Сalendar calendar;

  public CalendarService(Сalendar calendar) {
     this.calendar = calendar;
  }

    public void getCalendarForTheMonth (int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        String dayOfWeek = "Sun Mon Tue Wed Fri Sat";
        System.out.println(dayOfWeek);
        int dayOfWeekNumber = date.getDayOfWeek().getValue();
        // Определяем на какой день недели приходиться первый день месяца
        for (int i = 1; i <= dayOfWeekNumber; i++) {
            System.out.print("   ");
        }
        while (date.getMonthValue() == 5) {
            System.out.format("%3d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 6) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}