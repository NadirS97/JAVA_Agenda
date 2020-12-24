
/**
 *
 * @author Nadir
 *
 */

public class Categorie {

    /** Création de la Classe Categorie
     *
     * Une Catégorie se caractérise par plusieurs champs:
     *
     *• Un identifiant numérique
     *• Un intitulé (le « titre » de la categorie)
     *• Un acronyme (nom abrégé sur 3 charactères max)
     *
     */


    private int identifiant;
    private String titre;
    private String acronyme;
    private ListeChaine <SousCategorie> sousCategorie;



    /**
     * Constructeur de l'objet Categorie
     *
     * @param identifiant
     * @param titre
     * @param acronyme
     * @param sousCategorie
     */

    public Categorie (int identifiant, String titre, String acronyme) {
        setIdentifiant (identifiant);
        setTitre (titre);
        setAcronyme (acronyme);
        this.sousCategorie = new ListeChaine <SousCategorie>();
    }


    /**
     * Accesseur permettant d'acceder au champ :
     * -getIdentifiant() permettant d'acceder au champ identifiant de la classe (retourne this.identifiant)
     * @return
     */
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
     * Accesseur permettant d'acceder au champ :
     * -getSousCategories() permettant d'acceder au champ souscategories de la classe (retourne this.sousCategories)
     * @return
     */
    public ListeChaine <SousCategorie> getSousCategorie () {
        return this.sousCategorie;
    }


    /**
     * Mutateur permettant de donner des valeurs au champ ainsi qu'a générer une erreure lorsque l'identifiant saisis est nul
     * @param identifiant
     */

    public void setIdentifiant (int identifiant) {
        //assert (identifiant > 0) : "Erreur l'identifiant est negatif";
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
     * Mutateur permettant de donner des valeurs au champ sousCategorie ainsi que de creer une liste chainee de type SousCategories
     *
     * @param sousCategorie
     */
    public void setSousCategorie (ListeChaine <SousCategorie> sousCategorie) {
        this.sousCategorie = sousCategorie;
    }

    /**
     * Methode toString pour retourner les valeurs des champs
     */
    public String toString() {
        return "Categorie {Identifiant: "+ this.identifiant + ", Titre: " + this.titre + ", Acronyme: "+ this.acronyme + "}";
    }
}
