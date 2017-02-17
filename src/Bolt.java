/**
 * Created by Mudzso on 2017.02.14..
 */
import Shop.Elelmiszer;
import Shop.Tej;
import Shop.Sajt;

import java.util.Hashtable;
import java.util.Map;

public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<Long,BoltBejegyzes> elelmiszerpult;
    private int flag;

    public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long,BoltBejegyzes> elelmiszerpult) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.elelmiszerpult = elelmiszerpult;
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

    public boolean vanMegAdottAru(Class c){
        boolean van = false;
        for (Map.Entry<Long,BoltBejegyzes>entry:elelmiszerpult.entrySet()) {
            if (c.isInstance(entry.getValue().getE())) {
                van = true;

            }

        }
        return van;
    }
    public boolean vanMegTej(){
        boolean van = false;
        for (Map.Entry<Long, BoltBejegyzes>entry:elelmiszerpult.entrySet()) {
            if (entry.getValue().getE() instanceof Tej) {
                van = true;

            }

        }
        return van;
    }


    public boolean vanMegSajt(){
        boolean van = false;
        for (Map.Entry<Long, BoltBejegyzes>entry:elelmiszerpult.entrySet()) {
            if (entry.getValue().getE() instanceof Sajt) {
                van = true;

            }

        }
        return van;
    }

    public void vasarolElmiszert(long vonalkod,long mennyiseg){

        for (Map.Entry<Long,BoltBejegyzes>entry: elelmiszerpult.entrySet()) {
            if(entry.getKey() == vonalkod){
                try {
                    elelmiszerpult.get(vonalkod).levonMennyiseg(mennyiseg);
                }catch (TulSokLevonasKivitel e){
                    e.printStackTrace();
                }

            }

        }
    }

    public void torolElelmiszert(long vonalKod){
        for (Map.Entry<Long, BoltBejegyzes>entry:elelmiszerpult.entrySet()) {
            if (entry.getKey() == vonalKod){
                elelmiszerpult.remove(vonalKod);
            }
        }

    }

    public void feltoltElelmiszerrel(long vonalKod, long mennyiseg){
        for (Map.Entry<Long, BoltBejegyzes>entry:elelmiszerpult.entrySet()) {
            if (entry.getKey() == vonalKod){
                elelmiszerpult.get(vonalKod).addMennyiseg(mennyiseg);
            }
        }
    }

    public void feltoltUjElelmiszerrel(Elelmiszer e,long mennyiseg, long ar){

        elelmiszerpult.put(e.getVonalKod(),new BoltBejegyzes(e,mennyiseg,ar));
    }


    public class BoltBejegyzes{

        private Elelmiszer e;
        private long mennyiseg;
        private long ar;

        public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar) {
            this.e = e;
            this.mennyiseg = mennyiseg;
            this.ar = ar;
        }

        public Elelmiszer getE() {
            return e;
        }

        public void setE(Elelmiszer e) {
            this.e = e;
        }

        public long getMennyiseg() {
            return mennyiseg;
        }

        public void setMennyiseg(long mennyiseg) {
            this.mennyiseg = mennyiseg;
        }

        public long getAr() {
            return ar;
        }

        public void setAr(int ar) {
            this.ar = ar;
        }

        public void addMennyiseg(long mennyiseg){

            this.mennyiseg += mennyiseg;


        }

        public void levonMennyiseg(long mennyiseg) throws TulSokLevonasKivitel{

            if(this.mennyiseg - mennyiseg <= 0){
                throw new TulSokLevonasKivitel("tul sok levonnás");
            }
            else {

                this.mennyiseg -= mennyiseg;
            }
        }


    }
}
