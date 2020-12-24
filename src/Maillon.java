
/**
 *
 * @author Nadir
 *
 * @param <T> Le T pour le Typage autrement dis peut prendre tous les types (SousTaches, SousCategories...)
 */

public class Maillon <T> {

    /**Creation de la Classe Maillon
     *
     * Un Maillon se caracterise par deux champs:
     *
     * • Un champ info
     * • Un champ suivant (contenant l'adresse du prochain Maillon)
     *
     */

    T info;
    Maillon <T> suivant;



    /**
     * Constructeur de l'objet Maillon
     * Permettant de creer plusieurs Maillons a la chaine
     *
     * @param x
     * @param s
     */
    public Maillon (T x , Maillon <T> s) {
        this.info=x;
        this.suivant=s;
    }

    /**
     * Accesseur permettant d'acceder au champ:
     * -getInfo() permettant d'acceder au champ info de la classe (retourne this.info)
     * @return
     */
    public T getInfo () {
        return this.info;
    }

    /**
     * Accesseur permettant d'acceder au champ:
     * -getSuivant() permettant d'acceder au champ suivant de la classe (retourne this.suivant)
     * @return
     */
    public Maillon <T> getSuivant () {
        return this.suivant;
    }

    /**
     * Mutateur permettant de donner une valeur au champ
     * -setInfo (T info)
     * @param info
     */
    public void setInfo (T info) {
        this.info = info;
    }

    /**
     * Mutateur permettant de donner une valeur au champ
     * -setSuivant (Maillon <T> suivant)
     * @param info
     */
    public void setSuivant (Maillon <T> suivant) {
        this.suivant = suivant;
    }

    /**
     * Methode toString pour retourner les valeurs des champs
     */
    public String toString () {
        return "La valeur de ce maillon : " + this.info;
    }
}
