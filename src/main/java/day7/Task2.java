package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Player.info();

        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        Player.info();
        Player player7 = new Player();
        System.out.println(Player.getCountPlayers());

        while(player1.getStamina() > 0) {
            player1.run();
        }

        Player.info();
    }
}
