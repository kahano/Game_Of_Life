public class Main {
    public static void main(String[] args) {
        Celle celle = new Celle();
        System.out.println(celle.hentStatusTegn() == '.');
        celle.settLevende();
        System.out.println(celle.hentStatusTegn() == 'O');
        Celle nabo1 = new Celle();
        celle.leggTilNabo(nabo1);
        nabo1.settLevende();
        celle.tellLevendeNaboer();
        System.out.println("antall: " + celle.antLevendeNaboer());
    }
}