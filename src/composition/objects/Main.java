package composition.objects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Singer john = new Singer("Anthony",true,1988,"Rock");
        Singer coldplay = new Singer("Coldplay",true,1999,"Rock");
        Singer eskimoJoe = new Singer("Joe",false,1988,"Alternative");

        Song song1 = new Song(john,"Take me to the other side",2002,"rock");
        Song song2 = new Song(john,"Californication",1999,"rock");
        Song song3 = new Song(john,"Can't stop",1999,"rock");
        Song songC1 = new Song(coldplay, "Hardest Part", 2003, "rock");
        Song songC2 = new Song(coldplay, "Scaentist", 2003, "rock");
        Song songE1 = new Song(eskimoJoe, "Wake up", 2001, "alternative");

        Song[] arrayOfSongs = new Song[]{song1,song3, songC2,songE1,song2, songC1};
        Song[] coldplayAlbum = new Song[]{songC2, songC1};
        Song[] rHcPAlbum = new Song[]{song1,song3, song2,};
        Song[] eskimoAlbum = new Song[]{songE1};


        Singer[] singersOnConcert = new Singer[]{john,coldplay,eskimoJoe};

        Album xY = new Album("XY",coldplay,coldplayAlbum,"alternative");
        Album rHcP = new Album("RHCP",john,rHcPAlbum,"alternative");
        Album eskimoA = new Album("future",eskimoJoe,eskimoAlbum,"rock");
        Album[] arrayOfAlbums = new Album[]{xY,rHcP,eskimoA};



        Concert concert = new Concert(singersOnConcert,arrayOfSongs);
        System.out.println(concert.getMaxNumberOfSongs(concert));
        System.out.println(Arrays.toString(concert.getNumberOfSongsPerAlbum(concert,arrayOfAlbums)));


        System.out.println("Number of rock songs on album XY " );
        System.out.println(xY.countGenreAlbum(xY,"rock"));

        System.out.println("Entered song is from album: ");
        System.out.println(rHcP.printAlbumInformation(arrayOfAlbums,song1));

        System.out.println("Is the same autor of these two songs?");
        System.out.println(isSameAuthor(song1,songC2));

        System.out.println("Is this song fom solo author?");
        System.out.println(isFromSoloAuthor(song1));

        System.out.println("Older song is...");
        System.out.println(getOlderSong(songE1,songC1));


    }
    public static boolean isSameAuthor(Song song1, Song song2){
        if(song1.getSinger().equals(song2.getSinger())){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isFromSoloAuthor(Song song){
        if(song.getSinger().isBand == true){
            return false;
        }else{
            return true;
        }

    }
    public static int getOlderSong(Song song1, Song song2){
        if(song1.getYear() > song2.getYear()){
            return  song2.getYear();
        }else {
            return song1.getYear();
        }

    }
}
