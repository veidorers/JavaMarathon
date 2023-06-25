package day12.task4;


public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("1", 2000);
        MusicBand musicBand2 = new MusicBand("2", 2005);

        musicBand1.addMember("member1");
        musicBand1.addMember("member2");

        musicBand2.addMember("member3");
        musicBand2.addMember("member4");

        System.out.println(musicBand1);
        System.out.println(musicBand2);

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand2.printMembers();
        musicBand1.printMembers();
    }
}
