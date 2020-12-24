
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nadir
 *
 */

public class Tache {

    /** Création de la Classe Tâche
     *
     * Une tâche se caractérise par plusieurs champs :
     *
     *• Un identifiant numérique
     *• Un intitulé (le « titre » de la tâche)
     *• Champ categorie de type Categorie (classe definie parallelement)
     *• Champ date de type Date (classe definis parallelement)
     *• Champ nivUrgence correspondant au niveau d'urgence d'accomplissement de la Tache, compris entre 0 et 5 (selon l'urgence)
     *• Champ nivImportance correspondant au niveau d'importance de la Tache (ne peut etre nul)
     *• Champ volEstime correspondant au volume horraire en heures durant lequel l'utilisateur estime que sa tache serra effectuee
     *• Champ volReel correspondant au volume horraire en heures durant lequel l'utilisateur a effectue la tache
     *• Champ etat correspondant à l'etat d'avancement de l'accomplissement de la Tache
     *• Champ sousTaches de type Liste Chaine (de type SousTaches) (classe definie parallelement)
     *
     */

    private int identifiant;
    private String intitule;
    private Categorie categorie;
    private LocalDate date;
    private int nivUrgence;
    private int nivImportance;
    private int volEstime;
    private int volReel;
    private int etat;
    private ListeChaine <SousTaches> sousTaches;

    /**
     * Constructeur de l'objet Tache
     *
     * @param identifiant
     * @param intitule
     * @param cat
     * @param d
     * @param nivImportance
     * @param volEstime
     * @param volReel
     * @param etat
     * @param sousTaches
     */

    public Tache (int identifiant,String intitule,Categorie categorie,String date,int nivImportance,int volEstime,int etat ) {
        setIdentifiant (identifiant);
        setIntitule (intitule);
        setCategorie (categorie);
        setDate (date);
        setNivImportance (nivImportance);
        setVolEstime (volEstime);
        //setVolReel (volReel);
        setEtat (etat);
        this.sousTaches = new ListeChaine <SousTaches>();
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
     * -getCategorie() permettant d'acceder au champ categorie de la classe (retourne this.categorie)
     * @return
     */
    public Categorie getCategorie () {
        return this.categorie;
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
     *  -getNivUrgence() permettant d'acceder au champ nivUrgence de la classe (retourne this.nivUrgence)
     * @return
     */
    public int getNivUrgence () {
        return this.nivUrgence;
    }

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getNivImportance() permettant d'acceder au champ nivImportance de la classe (retourne this.nivImportance)
     * @return
     */
    public int getNivImportance () {
        return this.nivImportance;
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

    /**
     * Accesseur permettant d'acceder au champ :
     *
     * -getSousTaches() permettant d'acceder au champ sousTaches de la classe (retourne this.sousTaches)
     * @return
     */
    public ListeChaine <SousTaches> getSousTaches() {
        return this.sousTaches;
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
     * -setCategorie (Categorie cat): est une methode prenant en parametre cat de type Categorie
     * @param cat
     */
    public void setCategorie (Categorie categorie) {
        this.categorie = categorie;
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
     * -setNivImportance (int nivImportance): est une methode prenant en parametre nivImportance et genere une erreur si celui-ci est negatif
     * @param nivImportance
     */
    public void setNivImportance (int nivImportance) {
        //assert (nivImportance < 0) : "Erreur le niveau d'importance de la tache est negatif";
        this.nivImportance = nivImportance;
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

    /**
     * Mutateurs permettant de donner des valeurs au champ ainsi qu'a générer des erreures lorsque celles si sont presentes
     *
     * -setSousTaches (ListeChaine <SousTaches> sousTaches): est une methode prenant en parametre un Liste Chainee sousTaches de Types SousTaches
     * @param sousTaches
     */
    public void setSousTaches ( ListeChaine <SousTaches> sousTaches ) {
        this.sousTaches =sousTaches;
    }

    /**
     * Methode toString pour retourner les valeurs des champs
     */
    public String toString() {
        return "Tache: {Identifiant: "+ this.identifiant + ", Titre: " + this.intitule + ", Categorie associee: "+ this.categorie + ", Date: " + this.date + ", Niveau d'Importance: " + this.nivImportance + ", Volume Estimee: " + this.volEstime + ", Etat: " + this.etat + "}";
    }
}
