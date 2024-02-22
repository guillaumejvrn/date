public class evenement extends date{

    //creation de l'attribut nomEvenement
    private String nomEvenement= "";

    // creation du constructeur
    public evenement(int jour, int mois, int annee, String nomEvenement) {
        super(jour, mois, annee);
        this.nomEvenement = nomEvenement;
    }


    //redefinition de la methode toString
    @Override
    public String toString() {
        return super.toString() + " " + this.nomEvenement;
    }

    public boolean egale(evenement evenement) {
        return this.getJour() == evenement.getJour() && this.getMois() == evenement.getMois() && this.getAnnee() == evenement.getAnnee() && this.nomEvenement == evenement.nomEvenement;
    }

}
