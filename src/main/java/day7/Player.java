package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private static final Random random = new Random();

    public int getStamina() {
        return stamina;
    }

    public Player() {
        this.stamina = random.nextInt(10) + 90;
        if(countPlayers < 6)
            ++countPlayers;
    }

    public void run() {
        if(stamina == MIN_STAMINA) return;

        --stamina;
        if(stamina == MIN_STAMINA)
            --countPlayers;
    }

    public static void info() {
        if(countPlayers < 6) {
            System.out.println("На поле ещё есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
