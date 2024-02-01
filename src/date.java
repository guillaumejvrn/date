public class date {
    //initialisation des attributs
    private int jour;
    private int mois;
    private int annee;


    //constructeur des attributs jour, mois et annee
    public date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }


    //initioalisation des attributs jour, mois et annee a zero
    public date() {
        this.jour = 0;
        this.mois = 0;
        this.annee = 0;
    }


    //creation des getteurs / accesseurs des attibuts jour, mois et annee
    public int getJour() {
        return jour;
    }
    public int getMois() {
        return mois;
    }
    public int getAnnee() {
        return annee;
    }


    //creation des setter / mutateurs des attributs jour, mois et annee avec pour contraintes un jour ne peut pas être affecté si un mois n’a pas été affecté.
    // un jour est compris entre 1 et le nombre maximum de jours dans le mois
    // un mois est un entier compris entre 1 et 12
    public void setJour(int jour) {
        if (this.mois != 0) {
            if (jour >= 1 && jour <= an.nbJoursMois(this.annee)[this.mois - 1]) {
                this.jour = jour;
            }
        }
    }
    public void setMois(int mois) {
        if (mois >= 1 && mois <= 12) {
            this.mois = mois;
        }
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }


    //creation d'un deuxieme constructeur avec paramètres afin d’initialiser les valeurs des 3 attributs.
    /*
    public date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }*/


    //creation d'une methode afficher
    public void afficher() {
        System.out.println(this.jour + "/" + this.mois + "/" + this.annee);
    }
}