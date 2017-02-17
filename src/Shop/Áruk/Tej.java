package Shop.Áruk;

import Shop.Áruk.Elelmiszer;

import java.util.Date;

/**
 * Created by Mudzso on 2017.02.14..
 */
public abstract class Tej extends Elelmiszer {

    public static final int LITER = 4;
    public static final int FELLITER = 2;
    public static final int POHAR = 1;
    public static final double ZSIROS = 0.036;
    public static final double FELZSIROS = 0.028;


    protected int urtartalom;
    protected double zsirtartalom;
    protected long ar;

    public Tej(long vonalKod, String gyarto, Date szavatosagiido, int urtartalom, double zsirtartalom) {
        super(vonalKod, gyarto, szavatosagiido);
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
    }

    public Tej(long vonalKod, String gyarto, Date szavatosagiido, int urtartalom, double zsirtartalom, long ar) {
        super(vonalKod, gyarto, szavatosagiido);
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
        this.ar = ar;
    }

    public boolean joMeg(){
        Date mainap = new Date();
        return mainap.before(szavatosagiido);
    }

    public long getVonalKod() {
        return vonalKod;
    }

    public int getUrtartalom() {
        return urtartalom;
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

    public long getAr() {
        return ar;
    }

    public String toString(){
        return "vonalkod:" + getVonalKod() + "/n" +
                "urtartalom: "+ getUrtartalom() + "/n" +
                "gyarto: " + getGyarto() + "/n" +
                "szavatossagiido: " + getSzavatosagiido() + "/n" +
                "zsirtartalom: " + getZsirtartalom() + "/n" +
                "ar: " + getAr() + "/n";

    }
}