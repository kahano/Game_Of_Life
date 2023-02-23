

public class Rutenett {

    private int AntKolonner;
    private int AntRader;

    public Celle[][] rutene ;

    public Rutenett(int rad, int kol){
        this.AntRader = rad;
        this.AntKolonner = kol;
        rutene = new Celle[rad][kol];

    }

    public int get_AntRader(){
        return this.AntRader;
    }

    public int get_AntKolonner(){
        return this.AntKolonner;
    }



    public void lagCelle(int rad, int kol){
        Celle cell = new Celle();
        rutene[rad][kol] = cell;
        if(Math.random() <= 0.3333) {
            cell.settLevende();
        }
        else{
            cell.settDoed();

        }
        rutene[rad][kol] = cell;


    }

    public void fyllMedTilfeldigeCeller(){
        for(int i = 0; i < rutene.length;i++){
            for(int j = 0; j < rutene[i].length;j++){
                this.lagCelle(i,j);
            }
        }
    }

    public Celle hentCelle(int rad, int kol){
        if(rad >= AntRader || kol >= AntKolonner){
            return null;
        }
        if(rad < 0 || kol < 0){
            return null;
        }
        Celle cell = rutene[rad][kol];
        for(int i = 0;  i < AntRader;i++){
            for(int j = 0; j < AntKolonner;j++){
                if(rutene[i][j] == cell){
                    return cell;
                }

            }
        }
        return null;
    }



    public void tegnRutenett() {

        System.out.println("+---+---+---+---+---+---+---+---+---+---+---+---+");

        for(int i = 0; i < AntRader;i++){
            String brett = "";
            for(int j = 0; j < AntKolonner;j++){
                brett += " | " + rutene[i][j].hentStatusTegn();


            }
            System.out.println(brett + " |");
            System.out.println("+---+---+---+---+---+---+---+---+---+---+---+---+");
            System.out.println();

        }



    }

    public void settNaboer(int rad, int kol){

         Celle cell = this.hentCelle(rad,kol);


        if(rad > 0 ) {

            cell.leggTilNabo(this.hentCelle(rad-1,kol));
            cell.leggTilNabo(this.hentCelle(rad-1,kol+1));

            if(kol > 0){
                cell.leggTilNabo(this.hentCelle(rad-1,kol-1));
            }


        }

        if(kol > 0 ){
            cell.leggTilNabo(this.hentCelle(rad,kol-1));

            cell.leggTilNabo(this.hentCelle(rad+1,kol-1));






        }
        if(rad < AntRader-1 && kol < AntRader-1) {
            cell.leggTilNabo(this.hentCelle(rad + 1, kol + 1));
            cell.leggTilNabo(this.hentCelle(rad, kol + 1));
            cell.leggTilNabo(this.hentCelle(rad + 1, kol));
        }



    }



    public void kobleAlleCeller(){

        for(int i = 0; i < rutene.length;i++){
            for(int j = 0; j < rutene[i].length;j++){
                this.settNaboer(i,j);
            }
        }

    }

    public int antallLevende(){

        int antall_levende = 0;

        for(int i = 0; i < AntRader;i++){
            for(int j = 0; j < AntKolonner;j++){
                if(rutene[i][j].erlevende()){
                    antall_levende++;
                }
            }
        }
        return antall_levende;
    }



}
