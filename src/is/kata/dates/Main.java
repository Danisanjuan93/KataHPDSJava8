package is.kata.dates;

import java.time.*;

/**
 * Created by usuario on 08/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.now(); //Persistente. Usar siempre Instant
        System.out.println(instant);
        ZonedDateTime x = instant.atZone(ZoneId.of("Poland"));
        System.out.println("Hora de Polonia: " + x);
        LocalDateTime y = LocalDateTime.now();
        System.out.println(y);

        LocalDate date = LocalDate.now();
        date.atStartOfDay(ZoneId.of("Atlantic/Canary")).toInstant();
        System.out.println(date);
    }
}
