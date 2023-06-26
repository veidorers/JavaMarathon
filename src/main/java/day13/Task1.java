package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("John");
        User u2 = new User("Tom");
        User u3 = new User("Robert");

        u1.sendMessage(u2, "Привет!");
        u1.sendMessage(u2, "Как дела?!");

        u2.sendMessage(u1, "Привет!");
        u2.sendMessage(u1, "Хорошо!");
        u2.sendMessage(u1, "А у тебя как?!");

        u3.sendMessage(u1, "Привет!");
        u3.sendMessage(u1, "Когда сотку вернёшь?!");
        u3.sendMessage(u1, "Пора бы уже");

        u1.sendMessage(u3, "Привет, мой самый лучший друг!");
        u1.sendMessage(u3, "Прости, сейчас не могу");
        u1.sendMessage(u3, "Но наша дружба ведь гораздо важнее всего этого! Правда?");

        u3.sendMessage(u1, "Чтобы завтра сотка была.");

        MessageDatabase.showDialog(u1, u3);
    }
}
