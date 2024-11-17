package main.java;

import main.java.calendar.model.Сalendar;
import main.java.calendar.service.CalendarService;
import java.util.Scanner;

public class CalendarApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();

        Сalendar calendar = new Сalendar(year, month);
        CalendarService calendarService = new CalendarService(calendar);
        calendarService.getCalendarForTheMonth(calendar.getYear(), calendar.getMonth());
    }
}