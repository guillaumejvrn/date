public class an {
    public static boolean estBissextile(double annee){
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0 && annee % 4000 != 0);
    }
    public static int nbJoursAnnee(double annee) {
        if (estBissextile(annee)) {
            return 366;
        } else {
            return 365;
        }
    }
}
