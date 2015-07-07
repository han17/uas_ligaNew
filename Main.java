
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga inggris = new Liga("inggris");
        Liga spanyol = new Liga("Spanyol");

        //Divisi
        Divisi serieA = new Divisi("Serie A",inggris);
        Divisi serieB = new Divisi("Serie B",inggris);
        Divisi divisi1 = new Divisi("Divisi1",spanyol);
        Divisi divisi2 = new Divisi("Divisi2",spanyol);

        //Klub
        Klub chelsie = new Klub("Chelsie",serieA,inggris);
        Klub liverpool = new Klub("Liverpool",serieA,inggris);
        Klub arsenal = new Klub("Arsenal",serieB,inggris);
        Klub manchester = new Klub("Manchester city",serieB,inggris);
        Klub real = new Klub("Real Madrid",divisi1,spanyol);
        Klub barca = new Klub("Barcelona",divisi1,spanyol);
        Klub villa = new Klub("Villareal",divisi2,spanyol);
        Klub espanyol = new Klub("Espanyol",divisi2,spanyol);

        inggris.setDaftarDivisi(serieA);
        inggris.setDaftarDivisi(serieB);
        spanyol.setDaftarDivisi(divisi1);
        spanyol.setDaftarDivisi(divisi2);

        serieA.setDaftarKlub(chelsie);
        serieA.setDaftarKlub(liverpool);
        serieB.setDaftarKlub(arsenal);
        serieB.setDaftarKlub(manchester);
        divisi1.setDaftarKlub(real);
        divisi1.setDaftarKlub(barca);
        divisi2.setDaftarKlub(villa);
        divisi2.setDaftarKlub(espanyol);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga inggris : ");
        inggris.getDaftarDivisi("inggris");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga inggris : ");
        serieA.getDaftarKlubLiga("inggris");
        System.out.println("Liga Spanyol : ");
        divisi1.getDaftarKlubLiga("Spanyol");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        chelsie.getDivisi("Chelsie");
        real.getDivisi("Real Madrid");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        real.getLiga("Real Madrid");
    }
}

