
/**
 *
 * @author Nadir
 *
 */

public class SousCategorie {

    /** Création de la Classe SousCategories
     *
     * Une SousCategorie se caractérise par plusieurs champs :
     *
     *• Un identifiant numérique
     *• Un titre (le « titre » de la SousCategorie)
     *• Un acronyme (nom abrégé sur 3 charactères max)
     *
     */

    private int identifiant;
    private String titre;
    private String acronyme;
    private Categorie categorieParent;

    /**
     * Coustructeur de l'objet SousCategorie
     *
     * @param identifiant
     * @param titre
     * @param acronyme
     */
    public SousCategorie (int identifiant,String titre,String acronyme, Categorie categorieParent) {
        setIdentifiant (identifiant);
        setTitre (titre);
        setAcronyme (acronyme);
        setCategorieParent (categorieParent);
    }

    /**
     * Accesseur permettant d'acceder au champ :
     * -getIdentifiant() permettant d'acceder au champ identifiant de la classe (retourne this.identifiant)
     * @return
     */
    public Categorie getCategorieParent () {
        return this.categorieParent;
    }
    public int getIdentifiant () {
        return this.identifiant;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     * -getTitre() permettant d'acceder au champ titre de la classe (retourne this.titre)
     * @return
     */
    public String getTitre () {
        return this.titre;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     * -getAcronyme() permettant d'acceder au champ acronyme de la classe (retourne this.acronyme)
     * @return
     */
    public String getAcronyme () {
        return this.acronyme;
    }


    /**
     * Mutateur permettant de donner des valeurs au champ ainsi qu'a générer une erreure lorsque l'identifiant saisis est nul
     * @param identifiant
     */
    public void setCategorieParent (Categorie categorieParent) {
        this.categorieParent = categorieParent;
    }

    public void setIdentifiant (int identifiant) {
        //assert (identifiant < 0) : "Erreur l'identifiant est negatif";
        this.identifiant = identifiant;
    }

    /**
     * Mutateur permettant de donner des valeurs au champ ainsi qu'a générer une erreure lorsque le titre saisis ne contient aucun charactere
     * @param titre
     */
    public void setTitre (String titre) {
        //assert (titre == "") : "Erreur le Titre dois comporter au moin un charactere";
        this.titre = titre;
    }

    /**
     * Mutateur permettant de donner des valeurs au champ ainsi qu'a générer une erreure lorsque l'acronyme saisis est nul et / ou est contient plus de 3 characteres
     * @param acronyme
     */
    public void setAcronyme (String acronyme) {
        //assert ((acronyme.length() == 0) && (acronyme.length() > 3)) : "Erreur l'acronyme doit etre composer d'au moins un charactere et ne dois pas depasser 3";
        this.acronyme = acronyme;
    }

    /**
     * Methode toString pour retourner les valeurs des champs
     */
    public String toString() {
        return "Sous-Categorie {Identifiant: "+ this.identifiant + ", Titre: " + this.titre + ", Acronyme: "+ this.acronyme + ", Categorie Parent: "+ this.categorieParent + "}";
    }
}
