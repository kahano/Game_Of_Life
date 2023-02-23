public class Verden {
    public int genNr = 0;
    Rutenett rutenett;
    public Verden(int rad, int kol){
        rutenett = new Rutenett(rad,kol);
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();

    }

    public void tegn(){
        System.out.println(" ");
        System.out.println("generation: " + genNr);
        rutenett.tegnRutenett();
        System.out.println("Det er " + rutenett.antallLevende() + " levende celler");
        //System.out.println("\n ");



    }

    public void oppdatering(){

        try {
            for (int i = 0; i < rutenett.get_AntRader(); i++) {
                for (int j = 0; j < rutenett.get_AntKolonner(); j++) {
                    rutenett.hentCelle(i, j).tellLevendeNaboer();

                }

            }

            for (int i = 0; i < rutenett.get_AntRader(); i++) {
                for (int j = 0; j < rutenett.get_AntKolonner(); j++) {

                   rutenett.hentCelle(i, j).oppdaterStatus();
                }

            }
        }catch(NullPointerException e){
            System.out.println("NullPointerException Caught");
        }
        genNr++;
        this.tegn();
    }
}
