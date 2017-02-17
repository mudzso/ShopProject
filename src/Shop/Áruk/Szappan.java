package Shop.Áruk;
import Shop.Aru;

/**
 * Created by Mudzso on 2017.02.17..
 */
public class Szappan extends Aru{

    private char mosohatas;

    public Szappan(long vonalKod, String gyarto) {
        super(vonalKod, gyarto);
    }

    public Szappan(long vonalKod, String gyarto, char mosohatas) {
        super(vonalKod, gyarto);
        this.mosohatas = mosohatas;
    }
}
