package Shop; /**
 * Created by Mudzso on 2017.02.17..
 */

import Shop.Áruk.Szappan;
import Shop.Áruk.tej.FeltartosTej;
import Shop.Áruk.tej.TartosTej;
import Shop.Áruk.Tej;

import java.util.Date;

public class BoltFactory {

    public Tej ujTartorsTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiido, double zsirtartalom, long ar){
        Tej tej = new TartosTej(vonalKod,gyarto,szavatosagiido,urtartalom,zsirtartalom,ar);
        return tej;
    }
    public Tej ujFelTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,double zsirtartalom,long ar){
        Tej tej = new FeltartosTej(vonalKod,gyarto,szavatosagiido,urtartalom,zsirtartalom,ar);
        return tej;

    }

    public Tej ujFelZsirosTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new TartosTej(vonalKod,gyarto,szavatosagiido,urtartalom,Tej.FELZSIROS,ar);
        return tej;

    }

    public Tej ujZsirosTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new TartosTej(vonalKod,gyarto,szavatosagiido,urtartalom,Tej.ZSIROS,ar);
        return tej;

    }


    public Tej ujFelZsirosFelTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new FeltartosTej(vonalKod,gyarto,szavatosagiido,urtartalom,Tej.FELZSIROS,ar);
        return tej;

    }

    public Tej ujZsirosFelTartorsTej(long vonalKod, int urtartalom, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new FeltartosTej(vonalKod,gyarto,szavatosagiido,urtartalom,Tej.ZSIROS,ar);
        return tej;

    }

    public Tej ujFelZsirosLiterTartorsTej(long vonalKod, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new TartosTej(vonalKod,gyarto,szavatosagiido,Tej.LITER,Tej.FELZSIROS,ar);
        return tej;

    }

    public Tej ujZsirosLiterTartorsTej(long vonalKod, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new TartosTej(vonalKod,gyarto,szavatosagiido,Tej.LITER,Tej.ZSIROS,ar);
        return tej;

    }

    public Tej ujFelZsirosLiterFelTartorsTej(long vonalKod, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new FeltartosTej(vonalKod,gyarto,szavatosagiido,Tej.LITER,Tej.FELZSIROS,ar);
        return tej;

    }

    public Tej ujZsirosLiterFelTartorsTej(long vonalKod, String gyarto,Date szavatosagiido,long ar){
        Tej tej = new FeltartosTej(vonalKod,gyarto,szavatosagiido,Tej.LITER,Tej.ZSIROS,ar);
        return tej;

    }

    public Szappan ujszappan(long vonalKod,String gyarto,char mosohatás){
        Szappan szappan = new Szappan(vonalKod,gyarto,mosohatás);
        return szappan;
    }

    public Szappan ujMosohatasuszappan(long vonalKod,String gyarto){
        Szappan szappan = new Szappan(vonalKod,gyarto);
        return szappan;
    }

}
