package composition.objects;

/**
 * Created by zeljka on 5/25/16.
 */
public class Song {
    private Singer singer;
    private String name;
    private int year;
    private String genre;

    public Song(Singer singer, String name, int year, String genre) {
        this.singer = singer;
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public Singer getSinger() {
        return singer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
