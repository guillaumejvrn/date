import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class programme {
    public static void main(String[] args) {

        /*
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
        dateCouscous.toString();
        dateCamembert.toString();
        dateChocolat.toString();

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
        date troisiemeDate = new date(3, 1, 2010);
        System.out.println("comparaison de deux dates");
        System.out.println(premiereDate.comparer(deuxiemeDate));
        System.out.println(deuxiemeDate.comparer(premiereDate));

        //test de la methode avant apres
        System.out.println(premiereDate.avant(deuxiemeDate));
        System.out.println(deuxiemeDate.apres(premiereDate));
        System.out.println(premiereDate.egale(premiereDate));



        premiereDate.min(deuxiemeDate).toString();
        troisiemeDate.max(deuxiemeDate).toString();


        date.nomMois(2);
        date.nomMois(4);
        date dateDeValeur = new date(13, 2, 2024);
        date dateIncroyable = new date(15, 2, 2024);



        System.out.println(dateDeValeur.difference(dateIncroyable));
        System.out.println(dateIncroyable.difference(dateDeValeur));

        dateIncroyable.toString();

        date dateDeValeur2 = new date(366, 2024);

        date dateDEDebut = new date(11,11,2021);
        date dateDEFIN = new date(15,02,2024);
        System.out.println(dateDEDebut.difference(dateDEFIN));
        dateDeValeur2.toString();
        */

        //creation d'un objet de type evenement
        evenement rotiDePorc = new evenement(1, 1, 1900, "nouvel an");
        evenement nouvelAn = new evenement(1, 1, 2000, "nouvel an");
        evenement noel = new evenement(25, 12, 2000, "noel");
        evenement frites = new evenement(19, 7, 2200, "frites");
        date steak = new date(19, 7, 2400);
        evenement carnaval = new evenement(20, 7, 2400, "carnaval");

        System.out.println(nouvelAn.toString());
        System.out.println(rotiDePorc.egale(nouvelAn));
        System.out.println(rotiDePorc.egale(noel));


        System.out.println("comparaison");
        System.out.println(rotiDePorc.compareTo(steak));
        System.out.println(frites.compareTo(rotiDePorc));
        System.out.println(steak.compareTo(steak));



        //collection de dates qui s'appelle les dates
        ArrayList<date> lesDates = new ArrayList<date>();

        //deux evemenement au collection lesDates
        lesDates.add(frites);
        lesDates.add(carnaval);
        lesDates.add(steak);
        lesDates.add(rotiDePorc);
        lesDates.add(nouvelAn);




        Collections.sort(lesDates);
        for (date uneDate : lesDates) {
            System.out.println(uneDate);
        }
    }
}