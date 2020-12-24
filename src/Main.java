
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {

    static Scanner in = new Scanner(System.in);
    static int p = 100;

    static ListeChaine <Categorie> categorie = new ListeChaine <Categorie> ();
    static ListeChaine <Tache> tache = new ListeChaine <Tache> ();
    static ListeChaine <SousCategorie> sousCategorie = new ListeChaine <SousCategorie> ();
    static ListeChaine <SousTaches> sousTaches = new ListeChaine <SousTaches> ();

    public static void main(String [] args) {

        while (p == 100) {
            String format = "dd/MM/yy ";
            java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
            java.util.Date date = new java.util.Date();



            System.out.println("<******************{PROJET AGENDA "+ formater.format( date )+"}*****************>");
            System.out.println("]<===================={ MENU CREATION }=====================>[");
            System.out.println("1]-Pour creer une Categorie tapez sur ---------------------[1]");
            System.out.println();
            System.out.println("2]-Pour creer une Tache tapez sur -------------------------[2]");
            System.out.println();
            System.out.println("3]-Pour creer une Sous-Categorie tapez sur ----------------[3]");
            System.out.println();
            System.out.println("4]-Pour creer une Sous-Tache tapez sur --------------------[4]");
            System.out.println();

            System.out.println("]<=================={ MENU MODIFICATION }===================>[");
            System.out.println("5]-Pour modifier une Categorie tapez sur ------------------[5]");
            System.out.println();
            System.out.println("6]-Pour modifier une Tache tapez sur ----------------------[6]");
            System.out.println();
            System.out.println("7]-Pour modifier une Sous-Categorie tapez sur -------------[7]");
            System.out.println();
            System.out.println("8]-Pour modifier une Sous-Tache tapez sur -----------------[8]");
            System.out.println();

            System.out.println("]<==================={ MENU SUPPRESSION }===================>[");
            System.out.println("9]-Pour supprimer une Categorie tapez sur -----------------[9]");
            System.out.println();
            System.out.println("10]-Pour supprimer une Tache tapez sur -------------------[10]");
            System.out.println();
            System.out.println("11]-Pour supprimer une Sous-Categorie tapez sur ----------[11]");
            System.out.println();
            System.out.println("12]-Pour supprimer une Sous-Taches tapez sur -------------[12]");
            System.out.println();

            System.out.println("]<===================={ MENU AFFICHAGE }====================>[");
            System.out.println("13]-Pour afficher les Categories creee tapez sur ---------[13]");
            System.out.println();
            System.out.println("14]-Pour afficher les Taches creee tapez sur -------------[14]");
            System.out.println();
            System.out.println("15]-Pour afficher les Sous-Categories creee tapez sur ----[15]");
            System.out.println();
            System.out.println("16]-Pour afficher les Sous-Taches creee tapez sur --------[16]");
            System.out.println();

            System.out.println("]<===================={ MENU FERMETURE }====================>[");
            System.out.println("17]-Pour quitter le programme tapez sur ------------------[17]");
            System.out.println();
            System.out.print("Votre choix ?: ");
            int x = in.nextInt();


            if (x == 1) {
                in.nextLine();
                System.out.println("Veuillez saisir le Titre de la categorie");
                System.out.print("Titre: ");
                String t = in.nextLine();
                System.out.println("Veuillez saisir l'Acronyme de la categorie");
                System.out.print("Acronyme (max 3 characteres): ");
                String a = in.nextLine();
                Categorie cat = new Categorie(categorie.size(), t, a);
                categorie.add(cat);
                System.out.println("La catégorie a ete creer avec succes.");
                System.out.println();
                System.out.println("]<=========={ FIN DE LA CREATION CATEGORIE }============>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }
            }

            if (x == 2) {
                in.nextLine();
                System.out.println("Veuillez saisir le Titre de la Tache");
                System.out.print("Titre: ");
                String t = in.nextLine();
                for (int i = 0; i < categorie.size(); i++) {
                    System.out.println("Voici la liste des Categories creees:");
                    System.out.println(categorie.get(i).toString());
                    System.out.println();
                }
                System.out.println("Veuillez saisir le numero de l'identifiant de la Categorie a lier a la Tache");
                System.out.print("Identifiant de la Categorie: ");
                int w=in.nextInt();
                in.nextLine();
                System.out.println("Veuillez saisir la date de realisation de la Tache");
                System.out.print("Date (format='yyyy-mm-dd'): ");
                String a = in.nextLine();
                System.out.println ("Veuillez saisir le niveau d'importance pour la realisation de votre Tache");
                System.out.print("Niveau Importance: ");
                int ni = in.nextInt();
                in.nextLine();
                System.out.println("Veuillez saisir le volume horraire estime pour la realisation de votre Tache");
                System.out.print("Volume Estime: ");
                int ve= in.nextInt();
                in.nextLine();
                System.out.println("Veuillez saisir l'etat (en pourcentage) d'avancement de votre Tache");
                System.out.print("Etat: ");
                int et = in.nextInt();
                in.nextLine();
                Tache tach = new Tache(tache.size(), t, categorie.get(w) ,a, ni, ve, et);
                tache.add(tach);
                System.out.println("La Tache a ete creer avec succes.");
                System.out.println();
                System.out.println("]<============={ FIN DE LA CREATION TACHE }=============>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }
            }

            if (x == 3) {
                for (int i = 0; i < categorie.size(); i++) {
                    System.out.println("Voici la liste des Categories creer:");
                    System.out.println(categorie.get(i).toString());
                    System.out.println();
                }
                System.out.println("Veuillez saisir le numero de l'identifiant de la Categorie a lier a la Sous-Categorie");
                System.out.print("Identifiant: ");
                int w=in.nextInt();
                in.nextLine();
                System.out.println("Veuillez saisir le Titre de la Sous-Categorie");
                System.out.print("Titre: ");
                String t = in.nextLine();
                System.out.println("Veuillez saisir l'Acronyme de la Sous-Categorie");
                System.out.print("Acronyme (max 3 charactere): ");
                String a = in.nextLine();
                SousCategorie sc = new SousCategorie (sousCategorie.size(), t, a, categorie.get(w));
                sousCategorie.add(sc);
                System.out.println("La Sous-Categorie a ete creer avec succes.");
                System.out.println();
                System.out.println("]<========{ FIN DE LA CREATION SOUS-CATEGORIE }=========>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }
            }

            if (x == 4) {
                for (int i = 0; i < tache.size(); i++) {
                    System.out.println("Voici la liste des Taches creer:");
                    System.out.println(tache.get(i).toString());
                    System.out.println();
                }
                System.out.println("Veuillez saisir le numero de l'identifiant de la Tache a lier a la Sous-Tache");
                System.out.print("Identifiant: ");
                int w=in.nextInt();
                in.nextLine();
                System.out.println("Veuillez saisir le Titre de la Sous-Tache");
                System.out.print("Titre: ");
                String t = in.nextLine();
                System.out.println("Veuillez saisir la date de realisation de la Sous-Tache");
                System.out.print("Date (format='yyyy-mm-dd'): ");
                String a = in.nextLine();
                System.out.println("Veuillez saisir le volume horraire estime pour la realisation de votre Sous-Tache");
                System.out.print("Volume Estime: ");
                int ve= in.nextInt();
                in.nextLine();
                System.out.println("Veuillez saisir l'etat (en pourcentage) d'avancement de votre Sous-Tache");
                System.out.print("Etat: ");
                int et = in.nextInt();
                in.nextLine();
                SousTaches tach1 = new SousTaches (sousTaches.size(), t, a, ve, et, tache.get(w));
                sousTaches.add(tach1);
                System.out.println("La Sous-Tache a ete creer avec succes.");
                System.out.println();
                System.out.println("]<=========={ FIN DE LA CREATION SOUS-TACHE }===========>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }

            }

            if (x == 5) {
                for (int i = 0; i < categorie.size(); i++) {
                    System.out.println("Pour modifier la "+categorie.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Categorie a modifier");
                    System.out.print("Votre choix: ");
                    int o = in.nextInt();
                    System.out.println("]<=========={ MENU MODIFICATION CATEGORIE}==========>[");
                    System.out.println();
                    System.out.println("Pour modifier le Titre tapez ----------------------[1]");
                    System.out.println("Pour modifier l'Acronyme tapez --------------------[2]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int g = in.nextInt();
                    in.nextLine();
                    if (g == 1) {
                        System.out.println("Donnez le nouveau titre");
                        System.out.print("Nouveau Titre: ");
                        String y = in.nextLine();
                        categorie.get(o).setTitre(y);
                    }
                    if (g == 2) {
                        System.out.println("Donnez le nouveau acronyme");
                        System.out.print("Nouveau Acronyme (max 3 characteres): ");
                        String y = in.nextLine();
                        categorie.get(o).setAcronyme(y);
                    }
                    System.out.println("La Categorie a ete modifier avec succes.");
                    System.out.println();
                    System.out.println("]<==========={ FIN DE LA MODIFICATION CATEGORIE }============>[");
                    System.out.println("Pour revenir au Menu tapez ----------------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez ---------------------------------[0]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }
            }

            if (x == 6) {
                for (int i = 0; i < tache.size(); i++) {
                    System.out.println("Pour modifier la "+tache.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Tache a modifier");
                    System.out.print("Votre choix: ");
                    int o = in.nextInt();
                    System.out.println("]<============{ MENU MODIFICATION TACHE }============>[");
                    System.out.println();
                    System.out.println("Pour modifier le Titre tapez ----------------------[1]");
                    System.out.println("Pour modifier la Date tapez -----------------------[2]");
                    System.out.println("Pour modifier la Categorie Associee tapez ---------[3]");
                    System.out.println("Pour modifier l'Etat tapez ------------------------[4]");
                    System.out.println("Pour modifier le Niveau d'Importance tapez --------[5]");
                    System.out.println("Pour modifier le Volume Estime tapez --------------[6]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int g = in.nextInt();
                    in.nextLine();

                    if (g == 1) {
                        System.out.println("Donnez le nouveau titre");
                        System.out.print("Nouveau Titre: ");
                        String y = in.nextLine();
                        tache.get(o).setIntitule(y);
                    }

                    if (g == 2) {
                        System.out.println("Donnez le nouvelle Date");
                        System.out.print("Nouvelle Date (yyyy-mm-dd): ");
                        String y = in.nextLine();
                        tache.get(o).setDate(y);
                    }

                    if (g == 3) {
                        System.out.println("Donnez l'identifiant de la nouvelle Categorie Associee");
                        for (int i1 = 0; i1 < categorie.size(); i1++) {
                            System.out.println("Voici la liste des Categories creer:");
                            System.out.println(categorie.get(i1).toString());
                            System.out.println();
                        }
                        System.out.print("Identifiant: ");
                        int y = in.nextInt();
                        tache.get(o).setIdentifiant(y);
                        in.nextLine();
                    }

                    if (g == 4) {
                        System.out.println("Donnez le nouveau Etat");
                        System.out.print("Nouveau Etat: ");
                        int y = in.nextInt();
                        tache.get(o).setEtat(y);
                        in.nextLine();
                    }

                    if (g == 5) {
                        System.out.println("Donnez le nouveau Niveau d'Importance");
                        System.out.print("Nouveau Niveau d'Importance: ");
                        int y = in.nextInt();
                        tache.get(o).setNivImportance(y);
                        in.nextLine();
                    }

                    if (g == 6) {
                        System.out.println("Donnez le nouveau Volume Estime");
                        System.out.print("Nouveau Volume Estime: ");
                        int y = in.nextInt();
                        tache.get(o).setVolEstime(y);
                        in.nextLine();
                    }

                    System.out.println("La Tache a ete modifier avec succes.");
                    System.out.println();
                    System.out.println("]<========{ FIN DE LA MODIFICATION TACHE }==========>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }
            }


            if (x == 7) {
                for (int i = 0; i < sousCategorie.size(); i++) {
                    System.out.println("Pour modifier la "+sousCategorie.get(i).toString() + ", tapez: [" +i+"] ");
                    System.out.println("Choisissez la Sous-Categorie a modifier");
                    System.out.print("Votre choix: ");
                    int o = in.nextInt();
                    System.out.println("]<======={ MENU MODIFICATION SOUS-CATEGORIE }=======>[");
                    System.out.println("Pour modifier le Titre tapez ----------------------[1],");
                    System.out.println("Pour modifier l'Acronyme tapez --------------------[2]");
                    System.out.print("Votre choix: ");
                    int g = in.nextInt();
                    in.nextLine();
                    if (g == 1) {
                        System.out.println("Donnez le nouveau titre");
                        System.out.print("Nouveau Titre: ");
                        String y = in.nextLine();
                        sousCategorie.get(o).setTitre(y);
                    }
                    if (g == 2) {
                        System.out.println("Donnez le nouveau acronyme");
                        System.out.print("Nouveau Acronyme (max 3 characteres): ");
                        String y = in.nextLine();
                        sousCategorie.get(o).setAcronyme(y);
                    }
                    System.out.println("La Sous-Categorie a ete mofifier avec succes.");
                    System.out.println();
                    System.out.println("]<====={ FIN DE LA MODIFICATION SOUS-CATEGORIE }====>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }
            }

            if (x == 8) {
                for (int i = 0; i < sousTaches.size(); i++) {
                    System.out.println("Pour modifier la "+sousTaches.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Sous-Tache a modifier");
                    System.out.print("Votre choix: ");
                    int o = in.nextInt();
                    System.out.println("]<========={ MENU MODIFICATION SOUS-TACHE }========>[");
                    System.out.println();
                    System.out.println("Pour modifier le Titre tapez ----------------------[1]");
                    System.out.println("Pour modifier la Date tapez -----------------------[2]");
                    System.out.println("Pour modifier la Tache Principale associee tapez --[3]");
                    System.out.println("Pour modifier l'Etat tapez ------------------------[4]");
                    System.out.println("Pour modifier le Volume Estime tapez --------------[5]");
                    System.out.print("Votre choix: ");
                    int g = in.nextInt();
                    in.nextLine();

                    if (g == 1) {
                        System.out.println("Donnez le nouveau titre");
                        System.out.print("Nouveau Titre: ");
                        String y = in.nextLine();
                        sousTaches.get(o).setIntitule(y);
                    }

                    if (g == 2) {
                        System.out.println("Donnez le nouvelle Date");
                        System.out.print("Nouvelle Date (yyyy-mm-dd): ");
                        String y = in.nextLine();
                        sousTaches.get(o).setDate(y);
                    }

                    if (g == 3) {
                        System.out.println("Donnez l'identifiant de la nouvelle Tache Principale associee");
                        for (int i1 = 0; i1 < tache.size(); i1++) {
                            System.out.println("Voici la liste des Taches creer:");
                            System.out.println(tache.get(i1).toString());
                            System.out.println();
                        }
                        System.out.print("Identifiant: ");
                        int y = in.nextInt();
                        sousTaches.get(o).setIdentifiant(y);
                        in.nextLine();
                    }

                    if (g == 4) {
                        System.out.println("Donnez le nouveau Etat");
                        System.out.print("Nouveau Etat: ");
                        int y = in.nextInt();
                        sousTaches.get(o).setEtat(y);
                        in.nextLine();
                    }

                    if (g == 5) {
                        System.out.println("Donnez le nouveau Volume Estime");
                        System.out.print("Nouveau Volume Estime: ");
                        int y = in.nextInt();
                        sousTaches.get(o).setVolEstime(y);
                        in.nextLine();
                    }

                    System.out.println("La Sous-Tache a ete modifier avec succes.");
                    System.out.println();
                    System.out.println("]<======{ FIN DE LA MODIFICATION SOUS-TACHE }=======>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }

            }

            if (x == 9) {
                for (int i = 0; i < categorie.size(); i++) {
                    System.out.println("Pour supprimer la "+categorie.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Categorie a supprimer");
                    System.out.print("Votre Choix: ");
                    int o = in.nextInt();
                    categorie.remove(categorie.get(i));
                    System.out.println("La Categorie a ete supprimer avec succes.");
                    System.out.println();
                    System.out.println("]<======={ FIN DE LA SUPPRESSION CATEGORIE }========>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.print("Votre choix: ");
                    System.out.println();
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }
            }

            if (x == 10) {
                for (int i = 0; i < tache.size(); i++) {
                    System.out.println("Pour supprimer la "+tache.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Tache a supprimer");
                    System.out.print("Votre Choix: ");
                    int o = in.nextInt();
                    tache.remove(tache.get(i));
                    System.out.println("La Tache a ete supprimer avec succes.");
                    System.out.println();
                    System.out.println("]<========={ FIN DE LA SUPPRESSION TACHE }==========>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.print("Votre choix: ");
                    System.out.println();
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }

            }
            if (x == 11) {
                for (int i = 0; i < sousCategorie.size(); i++) {
                    System.out.println("Pour supprimer la "+sousCategorie.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Sous-Categorie a supprimer");
                    System.out.print("Votre choix: ");
                    int o = in.nextInt();
                    sousCategorie.remove(sousCategorie.get(i));
                    System.out.println("La Sous-Categorie a ete supprimer avec succes.");
                    System.out.println();
                    System.out.println("]<====={ FIN DE LA SUPPRESSION SOUS-CATEGORIE }=====>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.println();
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }
            }

            if (x == 12) {
                for (int i = 0; i < sousTaches.size(); i++) {
                    System.out.println("Pour supprimer la "+sousTaches.get(i).toString() + ", tapez: [" +i+"]");
                    System.out.println("Choisissez la Sous-Tache a supprimer");
                    System.out.print("Votre choix: ");
                    int o = in.nextInt();
                    sousTaches.remove(sousTaches.get(i));
                    System.out.println("La Sous-Tache a ete supprimer avec succes.");
                    System.out.println();
                    System.out.println("]<======={ FIN DE LA SUPPRESSION SOUS-TACHE }=======>[");
                    System.out.println("Pour revenir au Menu tapez ------------------------[1]");
                    System.out.println("Pour quitter l'Agenda tapez -----------------------[0]");
                    System.out.println();
                    System.out.print("Votre choix: ");
                    int m = in.nextInt();
                    if (m==0) {
                        p=99;
                    }
                }
            }

            if (x == 13) {
                if (categorie.size() == 0)
                    System.out.println("Il n'existe aucune Categorie a afficher.");
                else
                    for (int i = 0; i < categorie.size(); i++) {
                        System.out.println(categorie.get(i).toString());
                    }
                System.out.println();
                System.out.println("]<=========={ FIN DE L'AFFICHAGE CATEGORIE }============>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }
            }
            if (x == 14) {
                if (tache.size() == 0) {
                    System.out.println("Il n'existe aucune Tache a afficher.");
                }else{
                    for (int i = 0; i < tache.size(); i++) {
                        System.out.println(tache.get(i).toString());
                    }
                }
                System.out.println();
                System.out.println("]<=========={ FIN DE L'AFFICHAGE TACHE }============>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }
            }

            if (x == 15) {
                if (sousCategorie.size() == 0) {
                    System.out.println("Il n'existe aucune Sous-Categorie a afficher.");
                }else{
                    for (int i = 0; i < sousCategorie.size(); i++) {
                        System.out.println(sousCategorie.get(i).toString());
                    }
                }
                System.out.println();
                System.out.println("]<========{ FIN DE L'AFFICHAGE SOUS-CATEGORIE }=========>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }
            }

            if (x == 16) {
                if (sousTaches.size() == 0) {
                    System.out.println("Il n'existe aucune Sous-Categorie a afficher.");
                }else{
                    for (int i = 0; i < sousTaches.size(); i++) {
                        System.out.println(sousTaches.get(i).toString());
                    }
                }
                System.out.println();
                System.out.println("]<=========={ FIN DE L'AFFICHAGE SOUS-TACHE }===========>[");
                System.out.println("Pour revenir au Menu tapez ----------------------------[1]");
                System.out.println("Pour quitter l'Agenda tapez ---------------------------[0]");
                System.out.println();
                System.out.print("Votre choix: ");
                int m = in.nextInt();
                if (m==0) {
                    p=99;
                }

            }
            if (x == 17) {
                p=99;
                System.out.println("The End.");
            }

        }
    }
}