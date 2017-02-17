package Shop.Áruk;

import java.util.Date;
import Shop.Aru;

/**
 * Created by Mudzso on 2017.02.17..
 */
public  abstract class Elelmiszer extends Aru{



    protected Date szavatosagiido;


    public Elelmiszer(long vonalKod, String gyarto, Date szavatosagiido) {
        super(vonalKod,gyarto);
        this.szavatosagiido = szavatosagiido;
    }


    public long getVonalKod() {
        return vonalKod;
    }

    public String getGyarto() {
        return gyarto;
    }

    public Date getSzavatosagiido() {
        return szavatosagiido;
    }

    public boolean joMeg(){
        Date mainap = new Date();
        return mainap.before(szavatosagiido);
    }

    public String toString(){
        return "vonalKod: " + getVonalKod() + "/n" +
                "gyarto: " + getGyarto() + "/n" +
                "szavatosagiido: " + getSzavatosagiido();
    }

}
