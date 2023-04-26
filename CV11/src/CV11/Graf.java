package CV11;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graf {

    public void pridej(int idUzlu1, int idUzlu2, int cena) {
        Uzel u1 = vytvorNeboVezmiExistujiciUzel(idUzlu1);
        Uzel u2 = vytvorNeboVezmiExistujiciUzel(idUzlu2);

        Hrana h1 = new Hrana(u1, u2, cena);
        hrany.add(h1);

    }


    private HashMap<Integer, Uzel> uzly = new HashMap<>();
    private HashSet<Hrana> hrany = new HashSet<>();

    private Uzel vytvorNeboVezmiExistujiciUzel(int idUzlu) {
        Uzel novy = uzly.get(idUzlu);
        if (novy == null ) {
            novy = new Uzel(idUzlu);
            uzly.put(idUzlu, novy);
        }
        return novy;
    }

    public Collection<Uzel> getVrcholy() {
        return uzly.values();

    }

    public Set<Hrana> getHrany() {
        return hrany;
    }









}