public class an {
    //creation d'une methode estBissextile
    public static boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0 ;
    }


    //creation d'une methode nbJoursAnnee
    public static int nbJoursAnnee(int annee) {
        return estBissextile(annee) ? 366 : 365;
    }


    //creation d'une methode nbJoursMois
    public static int[] nbJoursMois(int annee) {
        int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (estBissextile(annee)) {
            joursParMois[1] = 29;
        }
        return joursParMois;
    }

}