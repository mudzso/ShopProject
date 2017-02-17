package Shop;

import java.util.Date;

/**
 * Created by Mudzso on 2017.02.17..
 */
public  abstract class Elelmiszer {


    protected long vonalKod;
    protected String gyarto;
    protected Date szavatosagiido;


    public Elelmiszer(long vonalKod, String gyarto, Date szavatosagiido) {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
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
