package Shop;


import javax.xml.transform.stream.StreamResult;
import java.util.Date;

/**
 * Created by Mudzso on 2017.02.17..
 */
public class Sajt extends Elelmiszer{

    long vonalKod;
    double suly;
    String gyarto;
    Date szavatosagiido;
    double zsirtartalom;

    public Sajt(long vonalKod, String gyarto, Date szavatosagiido, long vonalKod1, double suly, String gyarto1, Date szavatosagiido1, double zsirtartalom) {
        super(vonalKod, gyarto, szavatosagiido);
        this.vonalKod = vonalKod1;
        this.suly = suly;
        this.gyarto = gyarto1;
        this.szavatosagiido = szavatosagiido1;
        this.zsirtartalom = zsirtartalom;
    }



    public long getVonalKod() {
        return vonalKod;
    }

    public double getSuly() {
        return suly;
    }

    public String getGyarto() {
        return gyarto;
    }

    public Date getSzavatosagiido() {
        return szavatosagiido;
    }

    public double getZsirtartalom() {
        return zsirtartalom;
    }
    public boolean joMeg(){
        Date mainap = new Date();
        return mainap.before(szavatosagiido);
    }

    public String toString(){

        return "vonalkod: " + getVonalKod() + "/n" +
                "suly: " + getSuly() + "/n" +
                "gyarto: " + getGyarto() + "/n" +
                "szavatosagiido: " + getSzavatosagiido() + "/n" +
                "zsirtartalom: " + getZsirtartalom();
    }
}
