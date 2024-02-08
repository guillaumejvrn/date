public class programme {
    public static void main(String[] args) {
        //initialisation des objets date1
        date date1 = new date(1, 1, 2000);

        System.out.println(date1.getJour());
        System.out.println(date1.getMois());
        System.out.println(date1.getAnnee());

        //test des mutateurs
        date1.setJour(31);
        date1.setMois(12);
        date1.setAnnee(2020);
        System.out.println(date1.getJour());
        System.out.println(date1.getMois());
        System.out.println(date1.getAnnee());


        //creation de trois obj
        date dateCouscous = new date(19, 10, 1999);
        date dateCamembert = new date(15, 9, 2010);
        date dateChocolat = new date(11, 10, 2050);
        date dateFete = new date(1, 1, 2000);
        date dateFausse = new date(10, 1 ,2020);
        date dateFausse2 = new date(28, 2 ,2023);
        date dateFeteNational = new date(14, 7, 2023);


        //test de la methode afficher
        dateCouscous.afficher();
        dateCamembert.afficher();
        dateChocolat.afficher();

        //test de la methode egale
        System.out.println(dateCouscous.egale(dateCamembert));

        //test de la methode afficher
        System.out.println(dateCouscous.verifier());
        System.out.println(dateFausse.verifier());
        System.out.println(dateFausse2.verifier());

        //exemple numJourAnnee
        System.out.println(dateFeteNational.numJourAnnee());


        //creation d'un objet de type date
        date date2 = new date(1, 1, 2000);
        date presqueAujourdhui = new date(8, 2 ,2024);


        //test de la methode nomJourSemaine
        System.out.println(date2.nomJourSemaine());
        System.out.println(presqueAujourdhui.nomJourSemaine());

        //test de la methode comparer
        date premiereDate = new date(1, 1, 2000);
        date deuxiemeDate = new date(1, 1, 2001);
        System.out.println(comparer(premiereDate, deuxiemeDate));
    }
}