package composition.objects;

/**
 * Created by zeljka on 5/25/16.
 */
public class Singer {
   public String name;
    public boolean isBand;
    public int since;
    public String genre;

    public Singer(String name, boolean isBand, int since, String genre) {
        this.name = name;
        this.isBand = isBand;
        this.since = since;
        this.genre = genre;
    }
}
