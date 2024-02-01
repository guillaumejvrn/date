public class date {
    //initialisation des attributs
    private int jour;
    private int mois;
    private int annee;


    //constructeur des attributs jour, mois et annee
    public date(int jour, int mois, int annee) {
        if(jour >= 1 && jour <= an.nbJoursMois(annee)[mois - 1]) {
            this.jour = jour;
        }
        if (mois >= 1 && mois <= 12) {
            this.mois = mois;
        }
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
        if(jourDeLAn().egale(this)) {
            System.out.println("C'est le jour de l'an");
        }
    }


    //creation d'une methode jourDeLAn qui retourne un objet de
    //type Date, initialisé au premier janvier de l’année d’une instance de la classe Date.
    public date jourDeLAn() {
        return new date(1, 1, this.annee);
    }


    //methode egale
    public boolean egale(date date) {
        if (this.jour == date.jour && this.mois == date.mois && this.annee == date.annee) {
            return true;
        } else {
            return false;
        }
    }



    //methode verifier la validité d’une date
    public boolean verifier() {
        if (this.getJour() >= 1 && this.getJour() <= an.nbJoursMois(annee)[this.getMois() - 1] && this.getMois() >= 1 && this.getMois() <= 12) {
            return true;
        } else {
            return false;
        }
    }


    //creation de la methode numJourAnnee
    public int numJourAnnee() {
        int numJour = 0;
        for (int i = 1; i < this.getMois(); i++) {
            numJour += an.nbJoursMois(this.getAnnee())[i - 1];
        }
        numJour += this.getJour();
        return numJour;
    }
}