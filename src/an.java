public class an {
    //creation d'une methode estBissextile
    public static boolean estBissextile(int annee) {
        //si l'annee est divisible par 4 et non divisible par 100 ou divisible par 400
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            //alors l'annee est bissextile
            return true;
        } else {
            //sinon l'annee n'est pas bissextile
            return false;
        }
    }


    //creation d'une methode nbJoursAnnee
    public static int nbJoursAnnee(int annee) {
        //si l'annee est bissextile
        if (estBissextile(annee)) {
            //alors l'annee a 366 jours
            return 366;
        } else {
            //sinon l'annee a 365 jours
            return 365;
        }
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