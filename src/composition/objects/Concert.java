package composition.objects;

import java.util.Arrays;

/**
 * Created by zeljka on 5/25/16.
 */
public class Concert {
    private Singer[] singers;
    private Song[] songs;

    public Concert(Singer[] singers, Song[] songs) {
        this.singers = singers;
        this.songs = songs;
    }

    public Singer[] getSingers() {
        return singers;
    }

    public Song[] getSongs() {
        return songs;
    }

    /**receive concert an array of albums who exist on concert.
     *
     * @param concert {link@ Concert}
     * @param albums {link@ Albums[]}
     * @return @{int[]} number of songs from albums that was played on concert
     */
    public int[] getNumberOfSongsPerAlbum(Concert concert, Album[] albums) {
        int[] count = new int[albums.length];
        int counter = 0;

        for (int i = 0; i < albums.length; i++) {      //  pass trough all albums on concert
            System.out.println("Album number " + i);



            counter = 0;                                                // when loop finish check album and songs fom album on concert albums and songs counter need to reset
            for (int j = 0; j < albums[i].getArraySongs().length; j++) { // getting array of songs in that album and pass throw it

              for(int k = 0; k < songs.length; k++) {  // getting all songs fom concert
                  if (albums[i].getArraySongs()[j].equals(songs[k])) { // check if on current album(i) and his songs exist same osngs on concert
                      counter++;                                                    // if it is counter increase
                      System.out.println("Song on album " + albums[i].getName() + " Songs on concert " + counter);



                      count[i] = counter;           // array who we need to return must have length exact how many albums have array who we receive, so  album
                                                    // on i have that number of songs counter


                  }

              }
            }

        }
        return count;

    }

    /**
     * 
     * counting number of songs per singer and return singer who have highest number of song on concert ad total number of songs on concert.
     *
     * @param concert {link@ Concert}
     * @return singer who have highest number of song on concert an total count of songs of concert
     */
    public int getMaxNumberOfSongs(Concert concert) {
        int count = 0;
        int bound=0;
        String name = "";

        for (int i = 0; i < singers.length; i++) { // take all singers on concert and pass throw all
            count = 0;

            for (int j = 0; j < songs.length; j++) { // all songs on concert and pass throw all
                if (songs[j].getSinger().equals(singers[i])) { // getting song form concert an songs singer and check if he is equal and exist in singers in concert
                    count++;                                // if it is equal count them. On tjat way we getting all songs from singer on i
                }
            }
            if(count > bound ){  // to get singer who have highest number of songs on concert we must make min bound and it is 0.
                bound = count; //So if number of counted songs of each singer is greater than 0 than that bound will be number of counted songs per singer
                // on that way we getting singer with highest number of played songs on concert.
                name = singers[i].name;
            }

        }

        System.out.println(name);
        return bound;
    }
}
