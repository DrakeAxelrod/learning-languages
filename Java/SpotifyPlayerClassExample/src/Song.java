import java.util.Scanner;

public class Song {
    // attributes
    String title;
    String artist;
    int releaseYear;
    double songLength;

    // Constructor
    public Song(){
    }

    // Methods
    public void PlaySong(){
        this.title = title;
        this.artist = artist;

        System.out.print("Playing " + title + " by " + artist + "...Enjoy!");
    }
}
