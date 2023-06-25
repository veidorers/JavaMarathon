package day12.task5;

import java.util.LinkedList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists = new LinkedList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMember(MusicArtist artist) {
        artists.add(artist);
    }

    public void removeMember(MusicArtist artist) {
        artists.remove(artist);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.artists.addAll(band2.artists);
        band2.artists.clear();
    }

    public void printMembers() {
        System.out.println(artists);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + artists +
                '}';
    }
}
