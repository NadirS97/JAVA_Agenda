
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nadir
 *
 */

public class SousTaches {

    /** Création de la Classe SousTaches
     *
     * Une SousTaches se caractérise par plusieurs champs :
     *
     *• Un identifiant numérique
     *• Un intitulé (le « titre » de la SousTâche)
     *• Champ date de type Date (classe definis parallelement)
     *• Champ volEstime correspondant au volume horraire en heures durant lequel l'utilisateur estime que sa SousTaches serra effectuee
     *• Champ volReel correspondant au volume horraire en heures durant lequel l'utilisateur a effectue la SousTaches
     *• Champ etat correspondant à l'etat d'avancement de l'accomplissement de la SousTaches
     *
     */

    private int identifiant;
    private String intitule;
    private LocalDate date;
    private int volEstime;
    private int volReel;
    private int etat;
    private Tache tachePrincipale;

    /**
     * Constructeur de l'objet SousTaches
     *
     * @param identifiant
     * @param intitule
     * @param d
     * @param volEstime
     * @param volReel
     * @param etat
     */

    public SousTaches (int identifiant,String intitule, String date,int volEstime,int etat, Tache tachePrincipale) {
        setIdentifiant (identifiant);
        setIntitule (intitule);
        setDate (date);
        setVolEstime (volEstime);
        //setVolReel (volReel);
        setEtat (etat);
        setTachePrincipale(tachePrincipale);
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getIdentifiant() permettant d'acceder au champ identifiant de la classe (retourne this.identifiant)
     * @return
     */
    public int getIdentifiant () {
        return this.identifiant;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getIntitule() permettant d'acceder au champ ititule de la classe (retourne this.intitule)
     * @return
     */
    public String getIntitule () {
        return this.intitule;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getDate() permettant d'acceder au champ date de la classe (retourne this.date)
     * @return
     */
    public LocalDate getDate () {
        return this.date;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getVolEstimee() permettant d'acceder au champ volEstimee de la classe (retourne this.volEstimee)
     * @return
     */
    public int getVolEstime () {
        return this.volEstime;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getVolReel() permettant d'acceder au champ volReel de la classe (retourne this.volReel)
     * @return
     */
    public int getVolReel () {
        return this.volReel;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getEtat() permettant d'acceder au champ etat de la classe (retourne this.etat)
     * @return
     */
    public int getEtat () {
        return this.etat;
    }

    public Tache getTachePrincipale () {
        return this.tachePrincipale;
    }

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setIdentifiant(int identifiant): est une methode prenant en parametre un identifiant de type entier et cree une erreure dans le cas ou celui ci est negatif
     * @param identifiant
     */
    public void setIdentifiant (int identifiant) {
        //assert (identifiant <= 0) : "Erreur l'identifiant est negatif";
        this.identifiant = identifiant;
    }

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setIntitule(String intitule): est une methode prenant en parametre un intitule et genere une erreur si celui-ci ne contient aucun charactere
     * @param intitule
     */
    public void setIntitule (String intitule) {
        //assert (intitule == " ") : "Erreur le titre doit comporter au moins un charactere";
        this.intitule = intitule;
    }

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setDate (Date d): est une methode prenant en parametre une Date d
     * @param d
     */

    public boolean setDate (String date){
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
        java.util.Date d = new java.util.Date();
        try {
            d=sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        String t = sdf.format(d);
        if (t.compareTo(date)!= 0) {
            return false;
        }else {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern ("dd/mm/yyyy");
            LocalDate dt = LocalDate.parse(date, dtf);
            this.date = dt;
            return true;
        }
    }

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setVolEstime (int volEstime): est une methode prenant en parametre volEstime et genere une erreur si celui-ci est negatif
     * @param volEstime
     */
    public void setVolEstime (int volEstime) {
        //assert (volEstime < 0) : "Erreur le volume horaire estime est negatif";
        this.volEstime = volEstime;
    }

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setVolReel (int volReel): est une methode prenant en parametre volReel et genere une erreur si celui-ci est negatif
     * @param volReel
     */
    public void setVolReel (int volReel) {
        //assert (volReel < 0) : "Erreur le temps d'acomplissement de la tache doit etre different de 0";
        this.volReel = volReel;
    }

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setEtat (int etat): est une methode prenant en parametre etat et genere une erreur si celui-ci est negatif
     * @param etat
     */
    public void setEtat (int etat) {
        //assert ((etat < 0) && (etat > 100)) : "Erreur le pourcentage d'acomplissement de la tache doit etre compris entre 0 et 100";
        this.etat = etat;
    }

    public void setTachePrincipale (Tache tachePrincipale) {
        this.tachePrincipale = tachePrincipale;
    }

    /**
     * Methode toString pour retourner les valeurs des champs
     */
    public String toString() {
        return "Sous-Tache {Identifiant: "+ this.identifiant + ", Titre: " + this.intitule + ", Date: "+ this.date + ", Volume horraire estime: " + this.volEstime + ", Tache Principale: "+ this.tachePrincipale +", Etat: "+ this.etat + "}";
    }
}

