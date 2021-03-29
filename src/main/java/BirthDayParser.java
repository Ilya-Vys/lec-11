import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BirthDayParser {

    private final String date;

    public BirthDayParser(String date) {
        this.date = date;
    }

    public void checkIsDateAWorkingDay(){
        LocalDate localDate = LocalDate.parse(exchangeYearAndDay(), DateTimeFormatter.ISO_LOCAL_DATE);
        DayOfWeek day = localDate.getDayOfWeek();
        System.out.println(String.format("%s was a %s - %s", date, day, checkWeekDay(day)));
    }

    private String checkWeekDay(DayOfWeek day){
        String workingDay = "working day";
        String dayOff = "weekend";
        return switch (day) {
            case MONDAY, WEDNESDAY, TUESDAY, THURSDAY, FRIDAY -> workingDay;
            case SATURDAY, SUNDAY -> dayOff;
        };
    }

    private String exchangeYearAndDay(){
        String[] arr = date.split("-");
        String day = arr[0];
        arr[0]= arr[2];
        arr[2] = day;
        return String.join("-", arr);
    }
}
