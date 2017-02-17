package Shop;


import javax.xml.transform.stream.StreamResult;
import java.util.Date;

/**
 * Created by Mudzso on 2017.02.17..
 */
public class Sajt {

    long vonalKod;
    double suly;
    String gyarto;
    Date szavatosagiido;
    double zsirtartalom;

    public Sajt(long vonalKod, double suly, String gyarto, Date szavatosagiido, double zsirtartalom) {
        this.vonalKod = vonalKod;
        this.suly = suly;
        this.gyarto = gyarto;
        this.szavatosagiido = szavatosagiido;
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
