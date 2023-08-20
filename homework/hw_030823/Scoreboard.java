package homework.hw_030823;

import java.util.Random;

public class Scoreboard {
    private int timeSec;
    private int timeHour;

    public void runScoreboard() {
        Random random = new Random();
        timeSec = random.nextInt(0, 28801);
        timeHour = timeSec / 3600;
        String timeHourStr = timeHour > 0 ?  timeHour + " часов\n" : "Менее часа\n";
        System.out.print("До конца рабочего дня осталось: \n"
        + timeSec + " секунд\n"
        + timeHourStr);
    }
}
