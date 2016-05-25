package composition.objects;

/**
 * Created by zeljka on 5/25/16.
 */
public class Album {
    private String name;
    private Singer singer;
    private Song[] arraySongs;
    private String genreAlbum;


    public Album(String name, Singer singer, Song[] arraySongs, String genreAlbum) {
        this.name = name;
        this.singer = singer;
        this.arraySongs = arraySongs;
        this.genreAlbum = genreAlbum;
    }

    public String getName() {
        return name;
    }

    public Singer getSinger() {
        return singer;
    }

    public Song[] getArraySongs() {
        return arraySongs;
    }

    public String getGenreAlbum() {
        return genreAlbum;
    }

    public String printAlbumInformation(Album[] albums, Song song){
        for(int i = 0; i < albums.length; i++){
            for(int j = 0; j < albums[i].arraySongs.length; j++){
            if(albums[i].arraySongs[j].equals(song)){
                return albums[i].getName();
            }
        }
        }
        return null;
    }
    public int countGenreAlbum(Album album, String genre){
        int counter = 0;
        for(int i  = 0; i < getArraySongs().length; i++){
            if(album.getArraySongs()[i].getGenre().equals(genre)){
                counter++;
            }
        }
        return counter;
    }
}
