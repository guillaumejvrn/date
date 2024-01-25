public class date {
    public int jour;
    public int mois;
    public int an;

    public date(int jour, int mois, int an) {
        this.an = an;
        setMois(mois);
        setJour(jour);
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAn() {
        return an;
    }

    public void setJour(int jour) {
        if (mois != 0 && jour >= 1 && jour <= nbJoursMois()) {
            this.jour = jour;
        } else {
            System.out.println("Veuillez d'abord initialiser le mois ou saisir un jour valide.");
        }
    }

    public void setMois(int mois) {
        if (mois >= 1 && mois <= 12) {
            this.mois = mois;
        } else {
            System.out.println("Le mois doit être compris entre 1 et 12.");
        }
    }

    public void setAn(int an) {
        this.an = an;
    }

    private int nbJoursMois() {
        int[] joursMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (estBissextile(an)) {
            joursMois[1] = 29; // Février a 29 jours dans une année bissextile
        }
        return joursMois[mois - 1]; // Retourne le nombre de jours pour le mois spécifié
    }

    private boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0 && annee % 4000 != 0);
    }
}
