
import java.util.Arrays;
public class Celle {

    private boolean celle_levende ;


    public  Celle[] naboer ;
    public int antNaboer = 0;

    public int antLevendeNaboer = 0;


    public Celle(){
        celle_levende = false;
        naboer = new Celle[8];

    }

    public void settDoed(){
        celle_levende = false;

    }
    public void settLevende(){
       celle_levende = true;

    }

    public boolean erlevende(){
        return celle_levende;
    }



    public char hentStatusTegn(){
        if (this.erlevende()){
            return 'O';
        }
        else{
            return '.';
        }

    }

    public int hent_antNaboer(){
        return antNaboer;
    }




    public void leggTilNabo(Celle nabo){

        for(int i = 0; i < naboer.length;i++){
            if(naboer[i] == null) {
                naboer[i] = nabo;
                antNaboer++;
                return;
            }

        }



    }


    public void tellLevendeNaboer(){

        antLevendeNaboer=0;


            for (Celle nabo : naboer) {

                if (nabo != null )
                    if(nabo.erlevende()) antLevendeNaboer++;
            }

    }

    public Celle[] hentnaboer(){
        return naboer;
    }




    public int antLevendeNaboer(){
        return antLevendeNaboer;
    }



    public void oppdaterStatus(){

        if(this.erlevende()) {
            if (this.antLevendeNaboer() < 2 || this.antLevendeNaboer() > 3) {
                this.settDoed();

            }
        }else if(this.antLevendeNaboer() == 3){
            this.settLevende();
        }



    }






}
