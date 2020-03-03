package DB;

import domain.Gerecht;

import java.util.ArrayList;

public class GerechtDB {
    private ArrayList<Gerecht> gerechten = new ArrayList<>();

    public GerechtDB() {
        this.gerechten = new ArrayList<>();
    }
    public void addGerecht(Gerecht g) {
        gerechten.add(g);
    }

    Gerecht gerecht1 = new Gerecht("Ravioli", "Pasta", 580);

}
