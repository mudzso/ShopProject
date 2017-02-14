package Shop;

import java.util.Date;

/**
 * Created by Mudzso on 2017.02.14..
 */
public class Tej {

    private long vonalKod;
    private final int LITER = 4;
    private final int FELLITER = 2;
    private final int POHAR = 1;
    private final double ZSIROS = 0.036;
    private final double FELZSIROS = 0.028;


    protected int urtartalom;
    protected String gyarto;
    protected Date szavatosagiido;
    protected double zsirtartalom;
    protected long ar;

    public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiido, double zsirtartalom, long ar) {
        this.vonalKod = vonalKod;
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatosagiido = szavatosagiido;
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