/**
 * Created by Mudzso on 2017.02.14..
 */
import Shop.Tej;

import java.util.Hashtable;
import java.util.Vector;

public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<String,Tej> tejpult;
    private int flag;

    public Bolt(String nev, String cim, String tulajdonos, Hashtable<String,Tej> tejpult) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = tejpult;
    }

    public Bolt(String nev, String cim, String tulajdonos) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public boolean vanMegTej(){
        boolean van = false;
        if(tejpult.size() > 0){
            van = true;

        }
        return van;
    }

    public Tej vasarolTej(long vonalkod){
        return null;
    }

    public void feltoltTej(Tej m){

        tejpult.put("key",m);
    }
}
