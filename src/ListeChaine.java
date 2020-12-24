/**
 *
 * @author Nadir
 *
 * @param <T> Le T pour le Typage autrement dis peut prendre tous les types (SousTaches, SousCategories...)
 */
public class ListeChaine <T> {

    private Maillon <T> tete;

    public ListeChaine () {
        this.tete=null;
    }

    public ListeChaine (Maillon <T> m) {
        this.tete=m;
    }

    public ListeChaine <T> add(T v) {
        this.tete=new Maillon <T> (v,this.tete);
        return this;
    }


    public T elementTete () {
        return this.tete.info;
    }

    public boolean estListeVide () {
        return this.tete==null;
    }

    public ListeChaine <T> remove(T x) {
        Maillon <T> m;
        if (!this.estListeVide()) {
            if (this.elementTete().equals(x)) {
                this.tete=this.tete.suivant;
            }else{
                m=this.tete;
                while (m.suivant!=null && !m.suivant.info.equals(x)) {
                    m=m.suivant;
                }
                if (m.suivant!=null) {
                    m.suivant=m.suivant.suivant;
                }
            }
        }
        return this;
    }

    public String toString () {
        String s="";
        Maillon <T> m= tete;
        while (m!=null) {
            s+=m.info.toString()+ " ";
            m=m.suivant;
        }
        return s;
    }
    public int size() {
        Maillon courant = this.tete;
        int nombre = 0;
        while (courant!= null) {
            courant = courant.suivant;
            nombre = nombre + 1;
        }
        return nombre;
    }

    public T get (int i) {
        if (!estListeVide()&& this.size()>i ) {
            Maillon <T> m = this.tete;
            return get (i,m);
        }else {
            return null;
        }
    }

    public T get (int i, Maillon <T> m) {
        if (i==0) {
            return m.info;
        }else{
            return get (i-1, m.suivant);
        }
    }
}