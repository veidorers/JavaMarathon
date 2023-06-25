package day12.task4;

import java.util.LinkedList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new LinkedList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void removeMember(String member) {
        members.remove(member);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);
        band2.members.clear();
    }

    public void printMembers() {
        System.out.println(members);
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
                ", members=" + members +
                '}';
    }
}
