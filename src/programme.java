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
        date dateChocolat = new date(11, 16, 2050);


        //test de la methode afficher
        dateCouscous.afficher();
        dateCamembert.afficher();
        dateChocolat.afficher();
    }
}