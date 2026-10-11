package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class Playlist {


    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();


        songs.add("Pal Pal");
        songs.add("Die For Me");
        songs.add("Story of My Life");
        songs.add("Majboor");

        System.out.println(songs);

        songs.set(1, "Tu Hai Kahan");

        songs.add(0, "Insert");

        songs.remove("Story of My Life");

        System.out.println(songs);
        System.out.println("The Playlist size is :" + songs.size());





    }




}
