package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("1", 2000);
        MusicBand band2 = new MusicBand("2", 2005);
        MusicBand band3 = new MusicBand("3", 1999);
        MusicBand band4 = new MusicBand("4", 1987);
        MusicBand band5 = new MusicBand("5", 2023);
        MusicBand band6 = new MusicBand("6", 2001);
        MusicBand band7 = new MusicBand("7", 1957);
        MusicBand band8 = new MusicBand("8", 1988);
        MusicBand band9 = new MusicBand("9", 2016);
        MusicBand band10 = new MusicBand("10", 2020);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        Collections.shuffle(bands);
        List<MusicBand> after2000 = groupsAfter2000(bands);

        System.out.println(bands);
        System.out.println(after2000);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new LinkedList<>();
        for(MusicBand band : bands) {
            if(band.getYear() > 2000)
                after2000.add(band);
        }

        return after2000;
    }


}
