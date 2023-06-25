package day12.task5;


public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("1", 2000);
        MusicBand musicBand2 = new MusicBand("2", 2005);

        musicBand1.addMember(new MusicArtist("member1", 20));
        musicBand1.addMember(new MusicArtist("member2", 30));

        musicBand2.addMember(new MusicArtist("member3", 18));
        musicBand2.addMember(new MusicArtist("member4", 25));
        musicBand2.addMember(new MusicArtist("member5", 36));

        System.out.println(musicBand1);
        System.out.println(musicBand2);

        musicBand2.removeMember(new MusicArtist("member5", 36));

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
