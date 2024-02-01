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

}