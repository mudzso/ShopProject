/**
 * Created by Mudzso on 2017.02.14..
 */
import Shop.Tej;

import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<Tej,Integer> tejpult;
    private int flag;

    public Bolt(String nev, String cim, String tulajdonos, Hashtable<Tej,Integer> tejpult) {
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

        for (Map.Entry<Tej,Integer>entry:tejpult.entrySet()) {
            if(entry.getKey().getVonalKod() == vonalkod){
                tejpult.put(entry.getKey(),tejpult.get(entry.getKey())-1);
                return entry.getKey();
            }

        }
        return null;
    }

    public void feltoltTej(Tej m){
        if (tejpult.containsKey(m)){
            tejpult.put(m,tejpult.get(m)+1);
        }else {
            tejpult.put(m,1);
        }
    }



    public class BoltBejegyzes{

        private Tej t;
        private int mennyiseg;
        private int ar;

        public BoltBejegyzes(Tej t, int mennyiseg, int ar) {
            this.t = t;
            this.mennyiseg = mennyiseg;
            this.ar = ar;
        }

        public Tej getT() {
            return t;
        }

        public void setT(Tej t) {
            this.t = t;
        }

        public int getMennyiseg() {
            return mennyiseg;
        }

        public void setMennyiseg(int mennyiseg) {
            this.mennyiseg = mennyiseg;
        }

        public int getAr() {
            return ar;
        }

        public void setAr(int ar) {
            this.ar = ar;
        }

        public void addMennyiseg(int mennyiseg){

            this.mennyiseg += mennyiseg;


        }

        public void levonMennyiseg(int mennyiseg){

            this.mennyiseg -= mennyiseg;

        }


    }
}
