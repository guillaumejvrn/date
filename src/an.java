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
        // Tableau pour stocker le nombre de jours de chaque mois
        int[] joursParMois = new int[12];

        // Boucle sur les mois de l'année
        for (int mois = 1; mois <= 12; mois++) {
            // Nombre de jours par défaut pour le mois
            int nbJours = 31;

            // Si le mois est février
            if (mois == 2) {
                // Vérifier si l'année est bissextile
                if (estBissextile(annee)) {
                    nbJours = 29;
                } else {
                    nbJours = 28;
                }
            }
            // Si le mois est avril, juin, septembre ou novembre
            else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                nbJours = 30;
            }
            // Stocker le nombre de jours pour ce mois dans le tableau
            joursParMois[mois - 1] = nbJours;
        }

        return joursParMois;
    }

}