/**
 * Created by Mudzso on 2017.02.17..
 */

import Shop.*;

import java.util.Date;

public class TejFactory {

    public Tej ujTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,double zsirtartalom,long ar){
        Tej tej = new TartosTej(vonalKod,urtartalom,gyarto,szavatosagiido,zsirtartalom,ar);
        return tej;
    }
    public Tej ujFelTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,double zsirtartalom,long ar){
        Tej tej = new FeltartosTej(vonalKod,urtartalom,gyarto,szavatosagiido,zsirtartalom,ar);
        return tej;

    }
}
