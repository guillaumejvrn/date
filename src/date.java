public class date {
    //initialisation des attributs
    private int jour;
    private int mois;
    private int annee;


    //constructeur des attributs jour, mois et annee
    public date(int jour, int mois, int annee) {
        if (mois >= 1 && mois <= 12 && jour >= 1 && jour <= an.nbJoursMois(annee)[mois - 1]) {
            this.mois = mois;
            this.jour = jour;
            this.annee = annee;
        } else {
            System.out.println("Erreur : le mois n'est pas valide");
            System.exit(1);
        }

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
        for (int i = 1; i < this.mois; i++) {
            numJour += an.nbJoursMois(this.annee)[i - 1];
        }
        numJour += this.jour;
        return numJour;
    }
    //surcharge du constructeur de la classe date de telle sorte qu’il prenne pour arguments
    //le numéro du jour dans l’année et l’année.
    public date(int numJour, int annee) {
        this.annee = annee;
        int i = 1;
        while (numJour > an.nbJoursMois(annee)[i - 1]) {
            numJour -= an.nbJoursMois(annee)[i - 1];
            i++;
        }
        this.mois = i;
        this.jour = numJour;
    }


    //creation de la methode numJourSemaine en utilisant l'algorithme de mike keith
    public int numJourSemaine() {
        int a = (14 - this.mois) / 12;
        int y = this.annee - a;
        int m = this.mois + 12 * a - 2;
        int j = (this.jour + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return j;
    }
    //creation d'une methode nomJourSemaine qui retourne le nom du jour de la semaine en francais
    public String nomJourSemaine() {
        String[] jours = {"Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
        return jours[numJourSemaine()];
    }


    //creation de la methode comparer qui compare l'instance de la classe date avec un objet de type date passe en argument
    public int comparer(date date) {
        if (this.getAnnee() < date.getAnnee()) {
            return -1;
        } else if (this.getAnnee() > date.getAnnee()) {
            return 1;
        } else {
            if (this.getMois() < date.getMois()) {
                return -1;
            } else if (this.getMois() > date.getMois()) {
                return 1;
            } else {
                if (this.getJour() < date.getJour()) {
                    return -1;
                } else if (this.getJour() > date.getJour()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    //creation de la methode avant()
    public boolean avant(date date) {
        if (this.comparer(date) == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean apres(date date) {
        if (this.comparer(date) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean egal(date date) {
        if (this.comparer(date) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //méthode min() qui retourne la date qui précède l’autre, entre une
    //instance de la classe Date et une date passée en argument.
    public date min(date date) {
        if (this.avant(date)) {
            return this;
        } else {
            return date;
        }
    }

    //methode max

    public date max(date date) {
        if (this.apres(date)) {
            return this;
        } else {
            return date;
        }
    }

}